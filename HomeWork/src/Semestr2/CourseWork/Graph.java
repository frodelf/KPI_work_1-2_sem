package Semestr2.CourseWork;

public class Graph {
    Queue queue = new Queue();
    Stack stack = new Stack();
    private Vertex[] vertexArr;
    private int adjacencyMatrices[][];
    private int index = 0;
    private String dnsArr[] = new String[10];
    private int indexDns = 0;

    Graph(int size){
        vertexArr = new Vertex[size];
        adjacencyMatrices = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjacencyMatrices[i][j] = 0;
            }
        }
    }

    public void DNSip(String dns){
        dnsArr[indexDns++] = dns;
    }

    public void printDNSip() {
        int index1 = 0, index2 = 0;
        try {
            while(dnsArr[index1] != null){
                System.out.print(dnsArr[index2]+" =>");
                while (dnsArr[index1].equals(dnsArr[index2])) {
                    System.out.print("\t" + vertexArr[index1++].getIP() + ",\t");
                }
                index2 = index1;
                System.out.println();
            }
        }catch (NullPointerException e){
            System.out.println();
        }


    }

    public void addVertex(String IP){
        Vertex vertex = new Vertex(IP);
        vertexArr[index++] = vertex;
        vertex.setVisited(false);
    }

    private int getIndex(String IP){
        int i = 0;
        for (; i < index; i++) {
            if(IP.equals(vertexArr[i].getIP()))break;
        }
        return i;
    }

    public void addEdge(String vertexFrom, String vertexTo, int timeDelay){
        int vertexOne = getIndex(vertexFrom);
        int vertexTwo = getIndex(vertexTo);

        adjacencyMatrices[vertexOne][vertexTwo] = timeDelay;
        adjacencyMatrices[vertexTwo][vertexOne] = timeDelay;
    }

    public int check(int value){
        for (int i = 0; i < index; i++) {
            if(adjacencyMatrices[value][i] > 0  &&  vertexArr[i].getVisited() == false){
                return i;
            }
        }
        return -1;
    }

    public void passInDeep(String ip){

        int index = getIndex(ip);
        System.out.println(vertexArr[index].getIP());
        vertexArr[index].setVisited(true);
        stack.addStaack(index);

        while (!stack.isEmpty()){
            int neighbor = check(stack.peek());

            if(neighbor == -1)neighbor = stack.remove();
            else{
                System.out.println(vertexArr[neighbor].getIP());
                vertexArr[neighbor].setVisited(true);
                stack.addStaack(neighbor);
            }
        }

        for (int i = 0; i < this.index; i++) {
            vertexArr[i].setVisited(false);
        }
    }

    public void passInWidth(String ip){

        int index = getIndex(ip);
        System.out.println(vertexArr[index].getIP());
        vertexArr[index].setVisited(true);
        queue.addQueue(index);

        int head;

        while (!queue.isEmpty()){
            int temp = queue.remove();

            while ((head = check(temp)) != -1){
                System.out.println(vertexArr[head].getIP());
                vertexArr[head].setVisited(true);
                queue.addQueue(head);
            }
        }

        for (int i = 0; i < this.index; i++) {
            vertexArr[i].setVisited(false);
        }
    }

    public void deykstri(String ip) {
        for (int i = 0; i < adjacencyMatrices.length; i++) {
            for (int j = 0; j < adjacencyMatrices.length; j++) {
                if(adjacencyMatrices[i][j] == 0)adjacencyMatrices[i][j] = Integer.MAX_VALUE;
            }
        }
        int maxValue = Integer.MAX_VALUE;
        int begin = getIndex(ip);

        int[] delayTimeArr = new int[index];
        for (int i = 0; i < index; i++) {
            delayTimeArr[i] = adjacencyMatrices[begin][i];
        }

        delayTimeArr[begin] = 0;
        int index1 = 0;
        int u;
        for (int i = 0; i < index; i++) {
            int min = maxValue;
            for(int j = 0; j < index; j++) {
                if(!vertexArr[j].getVisited() && min > delayTimeArr[j]) {
                    min = delayTimeArr[j];
                    index1 = j;
                }
            }

            u = index1;
            vertexArr[u].setVisited(true);
            for (int j = 0; j < index; j++) {
                if (!vertexArr[j].getVisited() && adjacencyMatrices[u][j] != maxValue && delayTimeArr[u] != maxValue && (delayTimeArr[u] + adjacencyMatrices[u][j] < delayTimeArr[j])) {
                    delayTimeArr[j] = delayTimeArr[u] + adjacencyMatrices[u][j];
                }
            }
        }

        for (int i = 0; i < index; i++) {
            if(delayTimeArr[i] != maxValue) {
                System.out.println(vertexArr[begin].getIP() + " -> " + vertexArr[i].getIP() + " = " + delayTimeArr[i]);
            }
            else {
                System.out.println(vertexArr[begin].getIP() + " -> " + vertexArr[i].getIP() + " - isolated");
            }
        }

        for (int i = 0; i < index; i++) {
            vertexArr[i].setVisited(false);
        }
        System.out.println();
    }

    public void isolateVetrex(String hostsIP) {

        int r = getIndex(hostsIP);
        for(int i = 0; i < index; i++) {
            if (adjacencyMatrices[r][i] < Integer.MAX_VALUE) {
                adjacencyMatrices[r][i] = Integer.MAX_VALUE;
                adjacencyMatrices[i][r] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < adjacencyMatrices.length; i++) {
            for (int j = 0; j < adjacencyMatrices.length; j++) {
                if(adjacencyMatrices[i][j] == Integer.MAX_VALUE)adjacencyMatrices[i][j] = 0;
            }
        }
        System.out.println("Host " + hostsIP + " isolated\n");
    }
}
