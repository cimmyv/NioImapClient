package com.hubspot.imap.imap.command;

public class BlankCommand implements Command {
  public static final BlankCommand INSTANCE = new BlankCommand();

  @Override
  public String commandString() {
    return "";
  }

  @Override
  public String getTag() {
    return "";
  }

  @Override
  public CommandType getCommandType() {
    return null;
  }
}