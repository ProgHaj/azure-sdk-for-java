// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimes Get. */
public final class IntegrationRuntimesGetSamples {
    /*
     * operationId: IntegrationRuntimes_Get
     * api-version: 2018-06-01
     * x-ms-examples: IntegrationRuntimes_Get
     */
    /**
     * Sample code: IntegrationRuntimes_Get.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .integrationRuntimes()
            .getWithResponse(
                "exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", null, Context.NONE);
    }
}
