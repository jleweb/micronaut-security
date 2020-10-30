/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.oauth2.client.clientcredentials;

import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.core.util.Toggleable;
import io.micronaut.http.util.OutgointRequestProcessorMatcher;

/**
 * Client credentials configuration.
 *
 * @author Sergio del Amo
 * @since 2.2.0
 */
public interface ClientCredentialsConfiguration extends Toggleable, OutgointRequestProcessorMatcher {

    /**
     *
     * @return Scope to be requested in the client credentials request.
     */
    @Nullable
    String getScope();
}