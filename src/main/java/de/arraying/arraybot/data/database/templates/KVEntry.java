package de.arraying.arraybot.data.database.templates;

import de.arraying.arraybot.data.database.Redis;
import de.arraying.arraybot.data.database.core.Entry;
import de.arraying.arraybot.util.UDatabase;
import redis.clients.jedis.Jedis;

/**
 * Copyright 2017 Arraying
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public final class KVEntry implements Entry {

    private final Redis redis;
    private Category category;

    /**
     * Creates a new key/value entry.
     */
    public KVEntry() {
        this.redis = Redis.getInstance();
    }

    /**
     * Gets the entry type.
     * @return The type.
     */
    @Override
    public Type getType() {
        return Type.KV;
    }

    /**
     * Sets the category.
     * @param category The category.
     */
    @Override
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Gets a value from Redis.
     * @param key The key.
     * @return The value, can be null.
     */
    public String get(String key) {
        Jedis resource = redis.getJedisResource();
        String result = resource.get(UDatabase.getKey(category, key));
        resource.close();
        return result;
    }

    /**
     * Sets a value in Redis.
     * @param key The key.
     * @param value The value. Cannot be null.
     */
    public void set(String key, Object value) {
        Jedis resource = redis.getJedisResource();
        resource.set(UDatabase.getKey(category, key), value.toString());
        resource.close();
    }

}