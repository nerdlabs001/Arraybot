package de.arraying.arraybot.language

import de.arraying.arraybot.cache.Cache
import net.dv8tion.jda.core.entities.TextChannel
import net.dv8tion.jda.core.requests.RestAction

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
enum class Messages {

    COMMAND_DISABLED,
    COMMAND_DISABLED_GUILD,
    COMMAND_SYNTAX,
    COMMAND_PERMISSION,
    COMMAND_EMBED,
    COMMAND_EMBED_FOOTER,
    COMMAND_EMBED_PAGE,
    COMMAND_SUBCOMMAND,
    COMMAND_NODESCRIPTION,
    COMMAND_PAGE,
    COMMAND_PREMIUM,
    COMMAND_DEVELOPER,
    COMMAND_RESTART_INT,
    COMMAND_RESTART_EXISTS,
    COMMAND_RESTART_RESTARTING,
    COMMAND_RESTART_RESTARTED,
    COMMAND_RESTART_ERROR,
    COMMAND_COMMANDS_OVERVIEW_DESCRIPTION,
    COMMAND_COMMANDS_OVERVIEW_TITLE,
    COMMAND_COMMANDS_OVERVIEW_VALUE,
    COMMAND_COMMANDS_LIST_DESCRIPTION,
    COMMAND_COMMANDS_LIST_COMMANDS,
    COMMAND_COMMANDS_LISTALL_DESCRIPTION,
    COMMAND_COMMANDS_LISTALL_COMMANDS,
    COMMAND_COMMANDS_CATEGORY_DESCRIPTION,
    COMMAND_COMMANDS_CATEGORY_CATEGORIES,
    COMMAND_COMMANDS_CATEGORY_LIST_DESCRIPTION,
    COMMAND_COMMANDS_CATEGORY_LIST_COMMANDS,
    COMMAND_COMMANDS_INFO_DESCRIPTION,
    COMMAND_COMMANDS_INFO_NAME,
    COMMAND_COMMANDS_INFO_DESCRIPTIONCOMMAND,
    COMMAND_COMMANDS_INFO_CATEGORY,
    COMMAND_COMMANDS_INFO_PERMISSION,
    COMMAND_COMMANDS_INFO_SYNTAX,
    COMMAND_COMMANDS_INFO_HELP,
    COMMAND_COMMANDS_INFO_HELP_DESCRIPTION,
    COMMAND_COMMANDS_INFO_SPECIFY,
    COMMAND_COMMANDS_UNKNOWN_COMMAND,
    COMMAND_COMMANDS_UNKNOWN_CATEGORY,
    COMMAND_COMMANDS_EMPTY,
    COMMAND_COMMANDS_COMMAND,
    COMMAND_CUSTOM_EMBED_DESCRIPTION,
    COMMAND_CUSTOM_EMBED_TITLE,
    COMMAND_CUSTOM_EMBED_VALUE,
    COMMAND_CUSTOM_CREATE,
    COMMAND_CUSTOM_CREATE_EXISTS,
    COMMAND_CUSTOM_DELETE,
    COMMAND_CUSTOM_EXISTS,
    COMMAND_CUSTOM_SPECIFY,
    COMMAND_CUSTOM_UPDATE,
    COMMAND_CUSTOM_TYPE_INVALID,
    COMMAND_CUSTOM_TYPE_ARGUMENT,
    COMMAND_CUSTOM_SYNTAX_INVALID,
    COMMAND_CUSTOM_SYNTAX_ARGUMENT,
    COMMAND_CUSTOM_PERM_INVALID,
    COMMAND_CUSTOM_PERM_ARGUMENT,
    COMMAND_CUSTOM_DESCRIPTION_ARGUMENT,
    COMMAND_CUSTOM_VALUE_ARGUMENT,
    COMMAND_CUSTOM_LIST_EMPTY,
    COMMAND_CUSTOM_LIST_DESCRIPTION,
    COMMAND_CUSTOM_LIST_TITLE,
    COMMAND_CUSTOM_EXPORT,
    COMMAND_CUSTOM_EXPORT_ERROR,
    COMMAND_CUSTOM_IMPORT,
    COMMAND_CUSTOM_IMPORT_URL,
    COMMAND_CUSTOM_IMPORT_INVALID,
    COMMAND_CUSTOM_IMPORT_ARGUMENT,
    COMMAND_DEFAULT_EMBED_DESCRIPTION,
    COMMAND_DEFAULT_EMBED_TITLE,
    COMMAND_DEFAULT_EMBED_VALUE,
    COMMAND_DEFAULT_ENABLE,
    COMMAND_DEFAULT_ENABLE_ALREADY,
    COMMAND_DEFAULT_DISABLE,
    COMMAND_DEFAULT_DISABLE_ALREADY,
    COMMAND_DEFAULT_DISABLE_DEVELOPER,
    COMMAND_DEFAULT_DISABLE_DEFAULT,
    COMMAND_DEFAULT_EXISTS,
    COMMAND_DEFAULT_SPECIFY,
    COMMAND_DEFAULT_LIST_DESCRIPTION,
    COMMAND_DEFAULT_LIST_TITLE,
    COMMAND_HELP_EMBED_DESCRIPTION,
    COMMAND_HELP_EMBED_COMMANDS_TITLE,
    COMMAND_HELP_EMBED_COMMANDS_VALUE,
    COMMAND_HELP_EMBED_HELP_TITLE,
    COMMAND_HELP_EMBED_HELP_VALUE,
    COMMAND_HELP_EMBED_ANNOUNCEMENT,
    COMMAND_PREFIX_CURRENT,
    COMMAND_PREFIX_UPDATED,
    COMMAND_PREFIX_LENGTH,
    COMMAND_FILTER_EMBED_DESCRIPTION,
    COMMAND_FILTER_EMBED_TITLE,
    COMMAND_FILTER_EMBED_VALUE,
    COMMAND_FILTER_FILTER_ENABLED,
    COMMAND_FILTER_FILTER_DISABLED,
    COMMAND_FILTER_MESSAGE_MESSAGE,
    COMMAND_FILTER_MESSAGE_NONE,
    COMMAND_FILTER_MESSAGE_UPDATE,
    COMMAND_FILTER_MESSAGE_LENGTH,
    COMMAND_FILTER_ADD_PROVIDE,
    COMMAND_FILTER_ADD_EXISTS,
    COMMAND_FILTER_ADD_UPDATE,
    COMMAND_FILTER_ADD_LENGTH,
    COMMAND_FILTER_ADD_REGEX,
    COMMAND_FILTER_REMOVE_PROVIDE,
    COMMAND_FILTER_REMOVE_EXISTS,
    COMMAND_FILTER_REMOVE_UPDATE,
    COMMAND_FILTER_SILENT_ENABLED,
    COMMAND_FILTER_SILENT_DISABLED,
    COMMAND_FILTER_PRIVATE_ENABLED,
    COMMAND_FILTER_PRIVATE_DISABLED,
    COMMAND_FILTER_REGEX_ENABLED,
    COMMAND_FILTER_REGEX_DISABLED,
    COMMAND_FILTER_LIST_DESCRIPTION,
    COMMAND_FILTER_LIST_FILTERED,
    COMMAND_FILTER_LIST_NONE,
    COMMAND_FILTER_BYPASSADD_PROVIDETYPE,
    COMMAND_FILTER_BYPASSADD_PROVIDEID,
    COMMAND_FILTER_BYPASSADD_UPDATE,
    COMMAND_FILTER_BYPASSADD_EXISTS,
    COMMAND_FILTER_BYPASSADD_INVALIDTYPE,
    COMMAND_FILTER_BYPASSADD_INVALIDID,
    COMMAND_FILTER_BYPASSREMOVE_PROVIDE,
    COMMAND_FILTER_BYPASSREMOVE_INVALID,
    COMMAND_FILTER_BYPASSREMOVE_UPDATE,
    COMMAND_FILTER_BYPASSREMOVE_EXISTS,
    COMMAND_FILTER_BYPASSINFO_TITLE,
    COMMAND_FILTER_BYPASSINFO_DESCRIPTION,
    COMMAND_FILTER_BYPASSINFO_TYPE,
    COMMAND_FILTER_BYPASSINFO_VALUE,
    COMMAND_FILTER_BYPASSINFO_PROVIDE,
    COMMAND_FILTER_BYPASSINFO_INVALID,
    COMMAND_FILTER_BYPASSINFO_EXISTS,
    COMMAND_FILTER_BYPASSLIST_EMPTY,
    COMMAND_FILTER_BYPASSLIST_DESCRIPTION,
    COMMAND_FILTER_BYPASSLIST_TITLE,
    COMMAND_UPTIME_UPTIME,
    COMMAND_ANNOUNCER_EMBED_DESCRIPTION,
    COMMAND_ANNOUNCER_EMBED_TITLE,
    COMMAND_ANNOUNCER_EMBED_VALUE,
    COMMAND_ANNOUNCER_JOIN_ENABLED,
    COMMAND_ANNOUNCER_JOIN_DISABLED,
    COMMAND_ANNOUNCER_LEAVE_ENABLED,
    COMMAND_ANNOUNCER_LEAVE_DISABLED,
    COMMAND_ANNOUNCER_STATUS_ENABLED,
    COMMAND_ANNOUNCER_STATUS_DISABLED,
    COMMAND_ANNOUNCER_ANNOUNCEMENTS_ENABLED,
    COMMAND_ANNOUNCER_ANNOUNCEMENTS_DISABLED,
    COMMAND_EVAL_INFO,
    COMMAND_EVAL_PROVIDE,
    COMMAND_EVAL_ERROR,
    COMMAND_EVAL_SUCCESSFUL,
    COMMAND_EVAL_LENGTH,
    COMMAND_LOOKUP_PROVIDE,
    COMMAND_LOOKUP_INVALID,
    COMMAND_LOOKUP_EXISTS,
    CUSTOMCOMMAND_SYNTAX,
    CUSTOMCOMMAND_TYPE_INVALID,
    CUSTOMCOMMAND_SYNTAX_INVALID,
    CUSTOMCOMMAND_SYNTAX_PROVIDE,
    CUSTOMCOMMAND_PERMISSION,
    CUSTOMCOMMAND_PRIVATEMESSAGE,
    CUSTOMCOMMAND_NICKNAME,
    CUSTOMCOMMAND_NICKNAME_LENGTH,
    CUSTOMCOMMAND_NICKNAME_PERMISSION,
    CUSTOMCOMMAND_ADDROLE,
    CUSTOMCOMMAND_REMOVEROLE,
    CUSTOMCOMMAND_TOGGLEROLE,
    CUSTOMCOMMAND_ROLE_ID,
    CUSTOMCOMMAND_ROLE_PERMISSION,
    CUSTOMCOMMAND_USER_ID,
    CUSTOMCOMMAND_EMPTY,
    FILTER_MESSAGE,
    MISC_NONE,
    MISC_DEFAULTCOMMAND,
    MISC_CUSTOMCOMMAND,
    MISC_CUSTOMCOMMAND_VALUE,
    MISC_ROLE,
    MISC_ERROR,
    PUNISH_EMBED_TITLE,
    PUNISH_EMBED_USER,
    PUNISH_EMBED_STAFF,
    PUNISH_EMBED_REASON,
    PUNISH_EMBED_EXPIRATION,
    PUNISH_EMBED_EXPIRATION_FOOTER,
    PUNISH_EMBED_REVOCATION_AUTO,
    PUNISH_EMBED_REVOCATION_MANUAL,
    PUNISH_REASON,
    PUNISH_REASON_LENGTH,
    PUNISH_COMMAND_PROVIDE_USER,
    PUNISH_COMMAND_PROVIDE_TIME,
    PUNISH_COMMAND_INVALID_USER,
    PUNISH_COMMAND_INVALID_TIME,
    PUNISH_COMMAND_UNKNOWN_USER,
    PUNISH_COMMAND_SUCCESSFUL,
    PUNISH_COMMAND_UNSUCCESSFUL,
    PUNISH_COMMAND_PERMISSION;

    /**
     * Sends the message to the channel.
     */
    fun send(channel: TextChannel): RestAction<net.dv8tion.jda.core.entities.Message> {
        return channel.sendMessage(content(channel.guild.idLong))
    }

    /**
     * Gets the message content.
     */
    fun content(channel: TextChannel): String {
        return content(channel.guild.idLong)
    }

    /**
     * Gets the message content.
     */
    fun content(id: Long): String {
        return replace(Language.get(id, name.toLowerCase().replace("_", ".")), id)
    }

    companion object {

        private val githubBase = "https://github.com/Arraying/arraybot/"

        /**
         * Gets a random message.
         */
        fun getMessage(channel: TextChannel, message: String): String {
            return replace(Language.get(channel.guild, message), channel)
        }

        /**
         * Replaces common placeholders.
         */
        fun replace(input: String, channel: TextChannel): String {
            return replace(input, channel.guild.idLong)
        }

        /**
         * Replaces common placeholders.
         */
        fun replace(input: String, id: Long): String {
            return input
                    .replace("{prefix}", Cache.guilds[id]!!.prefix)
                    .replace("{github}", githubBase)
                    .replace("{zwsp}", "​")
                    .replace("-", "    **-**")
        }
    }

}