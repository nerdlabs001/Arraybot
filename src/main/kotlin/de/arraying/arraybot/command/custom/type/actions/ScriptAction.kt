package de.arraying.arraybot.command.custom.type.actions

import de.arraying.arraybot.Arraybot
import de.arraying.arraybot.command.CommandEnvironment
import de.arraying.arraybot.command.custom.type.CustomCommandAction
import de.arraying.arraybot.language.Message
import de.arraying.arraybot.util.UScript
import net.dv8tion.jda.core.entities.TextChannel

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
class ScriptAction: CustomCommandAction {

    /**
     * Gets the message.
     */
    override fun getMessage(channel: TextChannel): String {
        return ""
    }

    /**
     * Executes the script.
     */
    override fun onAction(environment: CommandEnvironment, value: String): Boolean {
        if(!Arraybot.INSTANCE.scriptManager.isValid(value)) {
            Message.CUSTOM_SCRIPT_INVALID.send(environment.channel).queue()
            return false
        }
        Arraybot.INSTANCE.scriptManager.executeScript(value, environment) {
            UScript.error(environment, it)
        }
        return true
    }

}