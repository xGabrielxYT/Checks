package me.HikeKlatki.TabCompletery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class tabCompleterA implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length == 1){
            List<String> arguments = new ArrayList<>();
            arguments.add("wlacz");
            arguments.add("wylacz");
            arguments.add("losujgraczy");
            arguments.add("start");
            arguments.add("zacznij");
            arguments.add("zakoncz");
            arguments.add("tp");
            arguments.add("kick");
            arguments.add("setspawn");
            arguments.add("etap");

            return arguments;
        }



        return null;
    }
}
