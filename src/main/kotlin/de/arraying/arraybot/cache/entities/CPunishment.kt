package de.arraying.arraybot.cache.entities

import de.arraying.arraybot.Arraybot
import de.arraying.arraybot.core.iface.ICache
import de.arraying.arraybot.core.punishment.PunishmentType

/**
 * Copyright 2017 Arraying
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class CPunishment(val id: Long,
                  val punishmentId: Long,
                  val user: Long,
                  val userString: String,
                  rawType: String,
                  val staff: Long,
                  val staffString: String,
                  val expiration: Long,
                  revoked: Boolean,
                  val reason: String):
        ICache {

    private val arraybot = Arraybot.instance
    val type = PunishmentType.getPunishableType(rawType)

    /**
     * Marks the punishment as revoked.
     */
    var revoked = revoked
        set(value) {
            field = value
            arraybot.managerSql.updatePunishmentTable(id, punishmentId, "revoked", value)
        }

}