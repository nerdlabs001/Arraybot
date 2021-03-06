package de.arraying.arraybot.util;

import org.apache.commons.text.WordUtils;

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
public final class UFormatting {

    /**
     * An array of all markup characters.
     */
    private static final char[] MARKUP_CHARS = {'*', '_', '~', '`'};

    /**
     * Strips all the formatting by escaping it.
     * @param input The input.
     * @return A stripped string.
     */
    public static String stripFormatting(String input) {
        for(char markup : MARKUP_CHARS) {
            input = input.replace(String.valueOf(markup), "\\" + markup);
        }
        return input;
    }

    /**
     * Removes all mass mentions from the input.
     * @param input The input.
     * @return A stripped string.
     */
    public static String removeMentions(String input) {
        return input.replace("@here", "@\u180ehere")
                .replace("@everyone", "@\u180eeveryone");
    }

    /**
     * Formats an Object array to list.
     * This will not append anything called "UNKNOWN".
     * @param input The array to format.
     * @return A formatted list.
     */
    public static String formatToList(Object[] input) {
        StringBuilder builder = new StringBuilder();
        for(Object object : input) {
            if(object.toString().equals("UNKNOWN")) {
                continue;
            }
            builder.append(UFormatting.displayableEnumField(object))
                    .append(", ");
        }
        String value = builder.toString().trim();
        if(!value.isEmpty()) {
            value = value.substring(0, value.length()-1);
        }
        return value;
    }

    /**
     * Makes an enum field displayable.
     * @param field The field.
     * @return A displayable string.
     */
    public static String displayableEnumField(Object field) {
        return WordUtils.capitalize(field.toString().toLowerCase())
                .replace("_", "");
    }

}
