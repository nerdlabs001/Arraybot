package de.arraying.arraybot.commands.command.moderation.filter.subcommands

import de.arraying.arraybot.commands.other.CommandEnvironment
import de.arraying.arraybot.core.iface.ISubCommand
import de.arraying.arraybot.language.Messages
import de.arraying.arraybot.utils.ULimit

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
class SubCommandFilterMessage:
        ISubCommand {

    override val subCommandName = "message"

    /**
     * Invokes the subcommand.
     */
    override fun onSubCommand(environment: CommandEnvironment, args: Array<String>) {
        val channel = environment.channel
        val mod = environment.cache?.mod?: return
        if(args.size < 3) {
            val message = mod.filterMessage
            if(message == null) {
                Messages.COMMAND_FILTER_MESSAGE_NONE.send(channel).queue()
                return
            }
            channel.sendMessage(Messages.COMMAND_FILTER_MESSAGE_MESSAGE.content(channel)
                    .replace("{message}", message)).queue()
            return
        }
        val stringBuilder = StringBuilder()
        for(i in (2.. args.size-1)) {
            stringBuilder.append(args[i])
                    .append(" ")
        }
        val message = stringBuilder.toString().trim()
        if(message.length > ULimit.FILTER_MESSAGE.maxLength) {
            Messages.COMMAND_FILTER_MESSAGE_LENGTH.send(channel).queue()
            return
        }
        mod.filterMessage = message
        Messages.COMMAND_FILTER_MESSAGE_UPDATE.send(channel).queue()
    }

}