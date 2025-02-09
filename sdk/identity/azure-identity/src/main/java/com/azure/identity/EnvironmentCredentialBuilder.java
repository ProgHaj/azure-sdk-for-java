// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.identity.implementation.util.ValidationUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

/**
 * Fluent credential builder for instantiating a {@link EnvironmentCredential}.
 *
 * @see EnvironmentCredential
 */
public class EnvironmentCredentialBuilder extends CredentialBuilderBase<EnvironmentCredentialBuilder> {
    private String authorityHost;

    /**
     * Specifies the Azure Active Directory endpoint to acquire tokens.
     * @param authorityHost the Azure Active Directory endpoint
     * @return An updated instance of this builder with the authority host set as specified.
     */
    public EnvironmentCredentialBuilder authorityHost(String authorityHost) {
        ValidationUtil.validateAuthHost(getClass().getSimpleName(), authorityHost);
        this.authorityHost = authorityHost;
        return this;
    }

    /**
     * Specifies the ExecutorService to be used to execute the authentication requests.
     * Developer is responsible for maintaining the lifecycle of the ExecutorService.
     *
     * <p>
     * If this is not configured, the {@link ForkJoinPool#commonPool()} will be used which is
     * also shared with other application tasks. If the common pool is heavily used for other tasks, authentication
     * requests might starve and setting up this executor service should be considered.
     * </p>
     *
     * <p> The executor service and can be safely shutdown if the TokenCredential is no longer being used by the
     * Azure SDK clients and should be shutdown before the application exits. </p>
     *
     * @param executorService the executor service to use for executing authentication requests.
     * @return An updated instance of this builder with the executor service set as specified.
     */
    public EnvironmentCredentialBuilder executorService(ExecutorService executorService) {
        this.identityClientOptions.setExecutorService(executorService);
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the credential.
     *
     * The default configuration store is a clone of the {@link Configuration#getGlobalConfiguration() global
     * configuration store}.
     *
     * @param configuration The configuration store used to load Env variables and/or properties from.
     *
     * @return An updated instance of this builder with the configuration store set as specified.
     */
    public EnvironmentCredentialBuilder configuration(Configuration configuration) {
        identityClientOptions.setConfiguration(configuration);
        return this;
    }

    /**
     * Creates a new {@link EnvironmentCredential} with the current configurations.
     *
     * @return a {@link EnvironmentCredential} with the current configurations.
     */
    public EnvironmentCredential build() {
        if (!CoreUtils.isNullOrEmpty(authorityHost)) {
            identityClientOptions.setAuthorityHost(authorityHost);
        }
        return new EnvironmentCredential(identityClientOptions);
    }
}
