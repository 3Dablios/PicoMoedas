package com.mrpowergamerbr.picomoedas;

import org.bukkit.ChatColor;

public class ConfigValues {
    public static String getFromConfig(Type type) {
        String onConfig = type.name;
        return PicoMoedasAPI.m.getConfig().getString(onConfig);
    }

    public static boolean getFromConfigBool(Type type) {
        String onConfig = type.name;
        return PicoMoedasAPI.m.getConfig().getBoolean(onConfig);
    }
    
    public static String getFromConfigColorized(Type type) {
        String onConfig = type.name;
        return ChatColor.translateAlternateColorCodes('&', PicoMoedasAPI.m.getConfig().getString(onConfig));
    }
    
    public enum Type {
        DEFAULT_TO_OPEN("LojaPadrao"),
        SUAS_MOEDAS("Mensagens.SuasMoedas"),
        MOEDAS_DO_PLAYER("Mensagens.MoedasDoPlayer"),
        SEM_MOEDAS_SUFICIENTES("Mensagens.SemMoedas"),
        CUSTO_NOME("Mensagens.Custo"),
        VOCE_ADICIONOU_OP("Mensagens.VoceAdicionouOP"),
        VOCE_REMOVEU_OP("Mensagens.VoceRemoveuOP"),
        USE_VAULT("UsarEconomiaDoVault");
        
        String name;
        
        Type(String name) {
            this.name = name;
        }
    }
}
