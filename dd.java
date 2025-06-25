import java.util.HashMap;
import java.util.Map;
// Represents a page table entry
class PageTableEntry {
    private int frameNumber;
    public PageTableEntry(int frameNumber) {
        this.frameNumber = frameNumber;
    }
    public int getFrameNumber() {
        return frameNumber;
    }
    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }
}
// Represents a page table
class PageTable {
    private Map<Integer, PageTableEntry> entries;
    public PageTable() {
        entries = new HashMap<>();
    }
    // Add a page to the page table
    public void addPage(int pageNumber, int frameNumber) {
        entries.put(pageNumber, new PageTableEntry(frameNumber));
    }
    // Get the frame number for a given page number
    public int getFrameNumber(int pageNumber) {
        PageTableEntry entry = entries.get(pageNumber);
        if (entry != null) {
            return entry.getFrameNumber();
        } else {
            // Page fault
            return -1;
        }
    }
}
// Represents the memory manager
class MemoryManager {
    private int[] frames;
    private boolean[] allocated;
    public MemoryManager(int numFrames) {
        frames = new int[numFrames];
        allocated = new boolean[numFrames];
    }
    // Allocate a frame for a page
    public int allocateFrame() {
        for (int i = 0; i < frames.length; i++) {
            if (!allocated[i]) {
                allocated[i] = true;
                return i;
            }
        }
        // No available frames
        return -1;
    }
    // Deallocate a frame
    public void deallocateFrame(int frameNumber) {
        allocated[frameNumber] = false;
    }
}
public class dd {
    public static void main(String[] args) {
        int numPages = 16; // Number of pages in the virtual memory
        int numFrames = 8; // Number of frames in the physical memory
        PageTable pageTable = new PageTable();
        MemoryManager memoryManager = new MemoryManager(numFrames);
        // Simulate page allocation
        for (int i = 0; i < numPages; i++) {
            int frameNumber = memoryManager.allocateFrame();
            pageTable.addPage(i, frameNumber);
            System.out.println("Page " + i + " allocated to frame " + frameNumber);
        }
        // Simulate page access
        int pageNumber = 5; // Page to access
        int frameNumber = pageTable.getFrameNumber(pageNumber);
        if (frameNumber != -1) {
            System.out.println("Accessing page " + pageNumber + " from frame " + frameNumber);
        } else {
            System.out.println("Page fault: Page " + pageNumber + " not in memory");
        }
        // Simulate page deallocation
        memoryManager.deallocateFrame(frameNumber);
        System.out.println("Frame " + frameNumber + " deallocated");
    }
}