package com.lingengma.aurora.jdbc.tx;

import jakarta.annotation.Nullable;

import java.sql.Connection;

/**
 * @author LingengMa
 * @date 2025/10/03 16:10
 * @Description:
 */


public class TransactionalUtils {

    @Nullable
    public static Connection getCurrentConnection() {
        TransactionStatus ts = DataSourceTransactionManager.transactionStatus.get();
        return ts == null ? null : ts.connection;
    }
}
