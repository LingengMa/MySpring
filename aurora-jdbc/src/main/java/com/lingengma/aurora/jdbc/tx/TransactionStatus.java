package com.lingengma.aurora.jdbc.tx;

import java.sql.Connection;

/**
 * @author LingengMa
 * @date 2025/10/03 16:15
 * @Description:
 */


public class TransactionStatus {
    final Connection connection;

    public TransactionStatus(Connection connection) {
        this.connection = connection;
    }
}
