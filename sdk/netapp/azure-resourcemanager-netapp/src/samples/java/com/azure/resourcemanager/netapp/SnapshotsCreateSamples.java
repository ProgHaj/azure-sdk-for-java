// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

/** Samples for Snapshots Create. */
public final class SnapshotsCreateSamples {
    /*
     * operationId: Snapshots_Create
     * api-version: 2021-06-01
     * x-ms-examples: Snapshots_Create
     */
    /**
     * Sample code: Snapshots_Create.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void snapshotsCreate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .snapshots()
            .define("snapshot1")
            .withRegion("eastus")
            .withExistingVolume("myRG", "account1", "pool1", "volume1")
            .create();
    }
}
