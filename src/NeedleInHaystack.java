public class NeedleInHaystack {

    public static void main(String[] args) {
        NeedleInHaystack needleInHaystack = new NeedleInHaystack();

        String[] arr = {"red", "blue", "yellow", "black", "grey"};

        Number result = needleInHaystack.findNeedle(arr, "blue");
        System.out.println(result);

    }

    public Number findNeedle(String[] haystack, String search) {
        for (int i=0; i<haystack.length; i++) {
            if (haystack[i].equalsIgnoreCase(search))
                return i;
        }
        return null;
    }
}
