package solarminecraft.application.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import solarminecraft.SolarMinecraft;

import java.time.LocalDateTime;
@Mod.EventBusSubscriber(modid = SolarMinecraft.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        ClientEventHandler.statsIndex = LocalDateTime.now().toLocalTime().toSecondOfDay() % 15;
        if (event.phase == TickEvent.Phase.END) {
            if (KeyBindings.INSTANCE.showSolarStats.isDown()) {
                ClientEventHandler.showAllSolarStats = true;
            } else if (ClientEventHandler.showAllSolarStats) {
                ClientEventHandler.showAllSolarStats = false;
            }
        }
    }
}
