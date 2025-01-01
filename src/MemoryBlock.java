public class MemoryBlock {
    private int startAddress;
    private int endAddress;

    public MemoryBlock(int startAddress, int endAddress) {
        this.startAddress = startAddress;
        this.endAddress = endAddress;
    }

    public int getStartAddress() {
        return startAddress;
    }

    public int getEndAddress() {
        return endAddress;
    }

}
