package org.codingdojo.kata;

public class ArgsDemo {
    private final Schema schema;
    private final Command command;

    public ArgsDemo(String schema, String command) {
        this.schema = new Schema(schema);
        this.command = new Command(command);
    }

    public Object getValue(String name) {
        return schema.getValue(name, command.getValue(name));
    }
}
