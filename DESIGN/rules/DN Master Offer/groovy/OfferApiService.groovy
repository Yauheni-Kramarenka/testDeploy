/* Copyright © 2024 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/


import com.eisgroup.genesis.openl.integration.discovery.api.ServiceDescriptor
import org.openl.rules.ruleservice.core.interceptors.RulesType

/**
 * Offer API service enhancer.
 *
 * @since 24.9
 * @author Vladyslav Pikus
 */
interface OfferApiService {

    @ServiceDescriptor(serviceGroup = "openl-policy-app/dental-master-offer", serviceName = "Behavior")
    Object Behavior(@RulesType("BehaviorRequest") Object behaviorRequest);

}
