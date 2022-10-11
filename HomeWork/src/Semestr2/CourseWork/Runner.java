package Semestr2.CourseWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Graph graph = new Graph(10);
        File fileVertex = new File("ListVertex.txt");
        File fileEdge = new File("ListEdge.txt");

        FileReader fileReaderVertex = new FileReader(fileVertex);
        FileReader fileReaderEdge = new FileReader(fileEdge);

        BufferedReader readerVertex = new BufferedReader(fileReaderVertex);
        BufferedReader readerEdge = new BufferedReader(fileReaderEdge);

        String dns;
        String ip;
        String toIp;
        int delayTime;
        do {
            dns = readerVertex.readLine();
            ip = readerVertex.readLine();
            graph.DNSip(dns);

            if(dns != null) {
                graph.addVertex(ip);
            }
        } while (dns != null);

        do {
            ip = readerEdge.readLine();

            if(ip != null) {
                toIp = readerEdge.readLine();
                delayTime = Integer.parseInt(readerEdge.readLine());
                graph.addEdge(ip, toIp, delayTime);
            }
        } while (ip != null);

        System.out.println("DNS => IP");
        graph.printDNSip();

        String currentPC = "me";//поточний комп'ютер
        System.out.println("\n___Завдання 1___ ");
        System.out.println("Обхід в глубину(DFS):");
        graph.passInDeep(currentPC);
        System.out.println("\nОбхід в ширину(BFS):");
        graph.passInWidth(currentPC);
        System.out.println("\n\n___Завдання 2___");
        System.out.println("Алгоритм Дейкстрі:");
        graph.deykstri(currentPC);
        System.out.println();
        System.out.println("\n\n___Завдання 3___");
        graph.isolateVetrex("5.5.5.5");
        System.out.println("Обхід в глубину(DFS):");
        graph.passInDeep(currentPC);
        System.out.println("\nОбхід в ширину(BFS):");
        graph.passInWidth(currentPC);
        System.out.println("\nАлгоритм Дейкстрі:");
        graph.deykstri(currentPC);
        System.out.println();

        fileReaderVertex.close();
        fileReaderEdge.close();
        readerVertex.close();
        readerEdge.close();
    }
}
