import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class kk
{
    // Number of processes and resources
    private static final int NUM_PROCESSES = 3;
    private static final int NUM_RESOURCES = 3;
    // Available resources
    private static int[] available = {3, 3, 2};
    // Maximum resources that can be allocated to each process
    private static int[][] maximum = {
            {7, 5, 3},
            {3, 2, 2},
            {9, 0, 2},
    };
    // Currently allocated resources to each process
    private static int[][] allocation = {
            {0, 1, 0},
            {2, 0, 0},
            {3, 0, 2},
    };
    // Needed resources for each process
    private static int[][] need = new int[NUM_PROCESSES][NUM_RESOURCES];
    // Locks for synchronization
    private static Lock[] locks = new ReentrantLock[NUM_RESOURCES];
    static {
// Initialize need matrix
        for (int i = 0; i < NUM_PROCESSES; i++) {
            for (int j = 0; j < NUM_RESOURCES; j++) {
                need[i][j] = maximum[i][j] - allocation[i][j];
            }
        }
// Initialize locks
        for (int i = 0; i < NUM_RESOURCES; i++) {
            locks[i] = new ReentrantLock();
        }
    }
    // Method to check if the system is in a safe state
    private static boolean isSafe() {
        int[] work = available.clone();
        boolean[] finish = new boolean[NUM_PROCESSES];
        int count = 0;
        while (count < NUM_PROCESSES) {
            boolean found = false;
            for (int i = 0; i < NUM_PROCESSES; i++) {
                if (!finish[i]) {
                    boolean allResourcesAvailable = true;
                    for (int j = 0; j < NUM_RESOURCES; j++) {
                        if (need[i][j] > work[j]) {
                            allResourcesAvailable = false;
                            break;
                        }
                    }
                    if (allResourcesAvailable) {
                        for (int j = 0; j < NUM_RESOURCES; j++) {
                            work[j] += allocation[i][j];
                        }
                        finish[i] = true;
                        count++;
                        found = true;
                    }
                }
            }
            if (!found) {
                return false; // Unsafe state
            }
        }
        return true; // Safe state
    }
    // Method to request resources by a process
    private static void requestResources(int processId, int[] request) {
        for (int i = 0; i < NUM_RESOURCES; i++) {
            if (request[i] > need[processId][i] || request[i] > available[i]) {
// Invalid request
                System.out.println("Process " + processId + " made an invalid request.");
                return;
            }
        }
// Try to acquire resources
        for (int i = 0; i < NUM_RESOURCES; i++) {
            locks[i].lock();
        }
// Check if the request can be granted
        boolean grant = true;
        for (int i = 0; i < NUM_RESOURCES; i++) {
            if (request[i] > available[i]) {
                grant = false;
                break;
            }
        }
        if (grant) {
// Pretend to allocate resources temporarily
            for (int i = 0; i < NUM_RESOURCES; i++) {
                available[i] -= request[i];
                allocation[processId][i] += request[i];
                need[processId][i] -= request[i];
            }
// Check if the system is still in a safe state after allocation
            if (isSafe()) {
                System.out.println("Process " + processId + " has been granted the resources.");
            } else {
// Rollback allocation
                for (int i = 0; i < NUM_RESOURCES; i++) {
                    available[i] += request[i];
                    allocation[processId][i] -= request[i];
                    need[processId][i] += request[i];
                }
                System.out.println("Process " + processId + " request would lead to deadlock Denied.");
            }
        } else {
            System.out.println("Process " + processId + " request would lead to deadlock. Denied.");
        }
// Release locks
        for (int i = 0; i < NUM_RESOURCES; i++) {
            locks[i].unlock();
        }
    }
    // Method to release resources by a process
    private static void releaseResources(int processId, int[] release) {
        for (int i = 0; i < NUM_RESOURCES; i++) {
            locks[i].lock();
        }
// Release resources
        for (int i = 0; i < NUM_RESOURCES; i++) {
            available[i] += release[i];
            allocation[processId][i] -= release[i];
            need[processId][i] += release[i];
        }
        System.out.println("Process " + processId + " released resources.");
// Release locks
        for (int i = 0; i < NUM_RESOURCES; i++) {
            locks[i].unlock();
        }
    }
    public static void main(String[] args) {
// Simulate resource requests and releases
        requestResources(0, new int[]{0, 1, 0}); // Process 0 requests {0, 1, 0}
        requestResources(1, new int[]{2, 0, 0}); // Process 1 requests {2, 0, 0}
        requestResources(2, new int[]{3, 0, 2}); // Process 2 requests {3, 0, 2}
        releaseResources(1, new int[]{2, 0, 0}); // Process 1 releases {2, 0, 0}
        requestResources(2, new int[]{1, 0, 2}); // Process 2 requests {1, 0, 2}
    }
}