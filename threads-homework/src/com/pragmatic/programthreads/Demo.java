package com.pragmatic.programthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {

        ScheduledExecutorService executor =
                Executors.newScheduledThreadPool(2);

        ProgramThread bitTorrent = new ProgramThread("BitTorrent");
        ProgramThread word = new ProgramThread("WORD");
        ProgramThread excel = new ProgramThread("EXCEL");
        ProgramThread powerpoint = new ProgramThread("POWERPOINT");
        ProgramThread calculator = new ProgramThread("Calculator");
        ProgramThread camera = new ProgramThread("Camera");
        ProgramThread eclipse = new ProgramThread("Eclipse");
        ProgramThread mail = new ProgramThread("Mail");
        ProgramThread photos = new ProgramThread("Photos");
        ProgramThread googleChrome = new ProgramThread("Google Chrome");

        List<ProgramThread> programThreads = new ArrayList<>();
        programThreads.add(bitTorrent);
        programThreads.add(word);
        programThreads.add(excel);
        programThreads.add(powerpoint);
        programThreads.add(calculator);
        programThreads.add(camera);
        programThreads.add(eclipse);
        programThreads.add(mail);
        programThreads.add(photos);
        programThreads.add(googleChrome);

        printStates(programThreads, executor);
        printActiveThreads(programThreads, executor);
        executeProgram(programThreads);
    }


    public static void executeProgram(List<ProgramThread> programThreads) {

        Scanner scanner = new Scanner(System.in);
        boolean isShutDown = false;
        String threadName = "";
        while (isShutDown == false) {
            System.out.println("Please start or stop a program");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("shutdown")) {
                isShutDown = true;
                System.out.println("Shutting down");
                for (int i = 0; i < programThreads.size(); i++) {
                    if (!programThreads.get(i).isInterrupted()) {
                        if(!programThreads.get(i).isInterrupted()) {
                            programThreads.get(i).interrupt();
                        }
                    }
                }
            } else if (command.startsWith("start")) {
                threadName = command.substring(6);
                for (ProgramThread programThread : programThreads) {
                    if (programThread.getProgramName().equalsIgnoreCase(threadName) && (!programThread.isAlive())) {
                        programThread.start();
                    }
                }
            } else if (command.startsWith("stop")) {
                threadName = command.substring(5);
                for (ProgramThread programThread : programThreads) {
                    if (programThread.getProgramName().equalsIgnoreCase(threadName)) {
                      if(!programThread.isInterrupted()){
                            programThread.interrupt();
                        }


                    }
                }
            } else {
                System.err.println("Invalid command!");
            }
        }
    }

    public static void printStates(List<ProgramThread> programThreads, ScheduledExecutorService executor) {

        Runnable task = () -> {
            for (ProgramThread programThread : programThreads)
                System.out.println(programThread.getProgramName() + "  " + programThread.getState());
        };
        ScheduledFuture<?> future = executor.schedule(task, 25,
                TimeUnit.SECONDS);
    }

    public static void printActiveThreads(List<ProgramThread> programThreads, ScheduledExecutorService executor) {

        Runnable task = () -> {
            for (ProgramThread programThread : programThreads) {
                if (programThread.isAlive()) {
                    System.out.println(programThread.getProgramName());
                }
            }
        };
        ScheduledFuture<?> future = executor.schedule(task, 15,
                TimeUnit.SECONDS);
    }
}
