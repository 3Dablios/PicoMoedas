package com.mrpowergamerbr.picomoedas;

import org.bukkit.ChatColor;

public class ConfigValues {
    public static String getFromConfig(Type type) {
        String onConfig = type.name;
        return PicoMoedasAPI.m.getConfig().getString(onConfig);
    }
    
    public static String getFromConfigColorized(Type type) {
        String onConfig = type.name;
        return ChatColor.translateAlternateColorCodes('&', PicoMoedasAPI.m.getConfig().getString(onConfig));
    }
    
    public enum Type {
        DEFAULT_TO_OPEN("LojaPadr�o"),
        SUAS_MOEDAS("Mensagens.SuasMoedas"),
        SEM_MOEDAS_SUFICIENTES("Mensagens.SemMoedas"),
        CUSTO_NOME("Mensagens.Custo");
        
        String name;
        
        Type(String name) {
            this.name = name;
        }
    }
}
