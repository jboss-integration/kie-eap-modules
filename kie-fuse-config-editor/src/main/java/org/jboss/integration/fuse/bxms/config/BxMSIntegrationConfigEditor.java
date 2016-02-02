/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.integration.fuse.bxms.config;

import org.wildfly.extras.config.ConfigContext;
import org.wildfly.extras.config.ConfigPlugin;
import org.wildfly.extras.config.LayerConfig;

import java.util.Arrays;
import java.util.List;


public class BxMSIntegrationConfigEditor implements ConfigPlugin {
    private static final String BPMS_LAYER_NAME = "bpms";

    public BxMSIntegrationConfigEditor() {
    }

    @Override
    public String getConfigName() {
        return BPMS_LAYER_NAME;
    }

    public List<LayerConfig> getLayerConfigs() {
        return Arrays.asList(
                new LayerConfig(BPMS_LAYER_NAME, LayerConfig.Type.INSTALLING, -9)
        );
    }

    @Override
    public void applyDomainConfigChange(ConfigContext configContext, boolean b) {

    }

    @Override
    public void applyStandaloneConfigChange(ConfigContext configContext, boolean b) {

    }
}
