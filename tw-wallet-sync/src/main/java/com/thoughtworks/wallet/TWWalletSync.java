package com.thoughtworks.wallet;

import com.thoughtworks.common.annotation.Node1PrivateKey;
import com.thoughtworks.common.annotation.QuorumRPCUrl;
import com.thoughtworks.common.annotation.DCEPContractAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.ipc.UnixIpcService;
import org.web3j.protocol.ipc.WindowsIpcService;
import org.web3j.tx.gas.DefaultGasProvider;

import java.util.concurrent.ExecutionException;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.thoughtworks.common","com.thoughtworks.wallet"})
public class TWWalletSync {

    @QuorumRPCUrl
    private String rpcUrl;

    public static void main(String[] args) {
        SpringApplication.run(TWWalletSync.class, args);
    }

    @Bean
    Web3j quorum() {
        String nodeEndpoint = rpcUrl;
        Web3jService web3jService;

        if (nodeEndpoint == null || nodeEndpoint.equals("")) {
            web3jService = new HttpService();
        } else if (nodeEndpoint.startsWith("http")) {
            web3jService = new HttpService(nodeEndpoint);
        } else if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            web3jService = new WindowsIpcService(nodeEndpoint);
        } else {
            web3jService = new UnixIpcService(nodeEndpoint);
        }

        return Web3j.build(web3jService);
    }
}
