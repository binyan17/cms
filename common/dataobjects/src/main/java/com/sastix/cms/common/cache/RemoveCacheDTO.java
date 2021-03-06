/*
 * Copyright(c) 2017 the original author or authors.
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

package com.sastix.cms.common.cache;

import java.io.Serializable;

public class RemoveCacheDTO implements Serializable{
    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 9214754074432928497L;

    /**
     * The key of the object to be cached
     */
    private String cacheKey;

    /**
     * An optional cache region to be used to group related keys together.
     * If not specified, the default region is used, named “default”
     * */
    String cacheRegion;

    public RemoveCacheDTO() {
    }

    /**
     * Constructor with mandatory fields
     *
     * @param cacheKey
     * */
    public RemoveCacheDTO(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    /**
     * Returns the cache key
     *
     * @return a String with the cache key
     * */
    public String getCacheKey() {
        return cacheKey;
    }

    /**
     * Set the cache key
     *
     * @param cacheKey
     * */
    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    /**
     * Returns the cache region
     *
     * @return a String with the cache region value
     * */
    public String getCacheRegion() {
        return cacheRegion;
    }

    /**
     * Set the cache region
     *
     * @param cacheRegion a String with the region
     * */
    public void setCacheRegion(String cacheRegion) {
        this.cacheRegion = cacheRegion;
    }
}
