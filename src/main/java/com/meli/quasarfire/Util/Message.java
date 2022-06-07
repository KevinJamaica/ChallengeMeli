package com.meli.quasarfire.Util;

import com.meli.quasarfire.Exceptions.EquationsException;

import java.util.ArrayList;
import java.util.List;

public final class Message {
    List<String[]> messages = new ArrayList<>();

    public Message() {
    }

    public String resolveMessage() {
        String completeMessage = "";
        String[] messagePositions;
        int position;
        int messageSize;
        try {
            messageSize = messageSize();
            messagePositions = new String[messageSize];
            for (String[] message : this.messages) {
                position = 0;
                for (String word : message) {
                    if (messagePositions[position] == null || messagePositions[position].isEmpty()) {
                        messagePositions[position] = word;
                    } else if (!messagePositions[position].isEmpty() && !word.isEmpty() &&
                            !messagePositions[position].equals(word)) {
                        throw new EquationsException();
                    }
                    position++;
                }
            }

            for (String word : messagePositions) {
                if (word.isEmpty()) {
                    throw new EquationsException();
                } else {
                    completeMessage += word;
                    if (!messagePositions[messagePositions.length - 1].equals(word)) {
                        completeMessage += " ";
                    }
                }
            }
        } catch (EquationsException ex){
            throw new EquationsException();
        }
        return completeMessage;
    }

    private int messageSize() {
        int size = 0;
        for (String[] message : this.messages) {
            if (size == 0) {
                size = message.length;
            } else if (size != message.length) {
                throw new EquationsException();
            }
        }
        return size;
    }
    public List<String[]> getMessages() {
        return messages;
    }

    public void setMessages(List<String[]> messages) {
        this.messages = messages;
    }
}
