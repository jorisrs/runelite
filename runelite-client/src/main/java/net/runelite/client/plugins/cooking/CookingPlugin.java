/*
 * Copyright (c) 2018, Joris K <kjorisje@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.cooking;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Provides;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.xptracker.XpTrackerPlugin;

import javax.inject.Inject;

@PluginDescriptor(
        name = "Cooking"
)
@PluginDependency(XpTrackerPlugin.class)
public class CookingPlugin extends Plugin
{
    @Inject
    private CookingOverlay overlay;

    private final CookingSession session = new CookingSession();

    @Provides
    CookingConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(CookingConfig.class);
    }

    @Override
    public CookingOverlay getOverlay()
    {
        return overlay;
    }

    public CookingSession getSession()
    {
        return session;
    }

    @Subscribe
    public void onChatMessage(ChatMessage event)
    {
        if(event.getType() == ChatMessageType.FILTERED)
        {
            if(event.getMessage().startsWith("You successfully cook a"))
            {
                session.setLastCookingAction();
                session.increaseCookAmount();
            }
            else if(event.getMessage().startsWith("You accidentally burn"))
            {
                session.setLastCookingAction();
                session.increaseBurnAmount();
            }
        }
    }
}
