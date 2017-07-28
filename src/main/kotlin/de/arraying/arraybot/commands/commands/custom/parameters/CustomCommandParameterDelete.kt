package de.arraying.arraybot.commands.commands.custom.parameters

import de.arraying.arraybot.commands.CommandEnvironment
import de.arraying.arraybot.commands.commands.custom.CustomCommands

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
class CustomCommandParameterDelete:
        CustomCommandParameter("--delete") {

    /**
     * Invokes the custom command parameter.
     */
    override fun invoke(environment: CommandEnvironment, input: String): String {
        val storage = CustomCommands.storage.retrieve(environment.message.idLong)
        storage!!.delete = true
        return input
    }

}