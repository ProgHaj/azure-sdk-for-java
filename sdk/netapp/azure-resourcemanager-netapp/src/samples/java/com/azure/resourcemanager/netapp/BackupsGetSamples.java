// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for Backups Get. */
public final class BackupsGetSamples {
    /*
     * operationId: Backups_Get
     * api-version: 2021-06-01
     * x-ms-examples: Backups_Get
     */
    /**
     * Sample code: Backups_Get.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupsGet(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backups().getWithResponse("myRG", "account1", "pool1", "volume1", "backup1", Context.NONE);
    }
}
