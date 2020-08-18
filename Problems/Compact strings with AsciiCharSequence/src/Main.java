import java.util.*;

class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return this.bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.bytes, start, end));
    }

    @Override
    public String toString() {
        return new String(this.bytes);
    }
}