public enum Os {
    WINDOWS,
    LINUX,
    MAC,
    OTHER;

    public static Os determine() {

        Os out = OTHER;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            out = WINDOWS;
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            out = LINUX;
        } else if (osName.contains("mac")) {
            out = MAC;
        }
        return out;
    }
}
