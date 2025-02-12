class Process {
    int processId, burstTime, priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head, tail;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void executeProcesses(int timeQuantum) {
        if (head == null) return;
        Process temp = head;
        while (true) {
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                System.out.println("Process " + temp.processId + " executed for " + timeQuantum + " units. Remaining: " + temp.burstTime);
            } else {
                System.out.println("Process " + temp.processId + " completed execution.");
                removeProcess(temp.processId);
            }
            temp = temp.next;
            if (temp == null) break;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (prev == null) { // Remove head
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println(temp.processId + " " + temp.burstTime + " " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler rrs = new RoundRobinScheduler();
        rrs.addProcess(1, 10, 1);
        rrs.addProcess(2, 5, 2);
        rrs.displayProcesses();
        rrs.executeProcesses(4);
        rrs.displayProcesses();
    }
}
