// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;

/** Samples for Databases Delete. */
public final class DatabasesDeleteSamples {
    /*
     * operationId: Databases_Delete
     * api-version: 2021-06-01
     * x-ms-examples: Delete a database
     */
    /**
     * Sample code: Delete a database.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void deleteADatabase(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.databases().delete("TestGroup", "testserver", "db1", Context.NONE);
    }
}
