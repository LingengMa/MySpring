package com.lingengma.aurora.jdbc;

import jakarta.annotation.Nullable;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author LingengMa
 * @date 2025/10/03 16:10
 * @Description:
 */


@FunctionalInterface
public interface ConnectionCallback<T> {

    @Nullable
    T doInConnection(Connection con) throws SQLException;

}
