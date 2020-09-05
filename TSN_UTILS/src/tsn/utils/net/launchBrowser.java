package tsn.utils.net;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Запуск браузера
 *
 * @author Талипов С.Н.
 */
public class launchBrowser {

    /**
     * Запуск браузера с заданным адресом (используется отдельный поток)
     *
     * @param uriStr адрес, например:
     * "http://ru.scribd.com/collections/4345703/Lectures-on-Java"
     */
    public launchBrowser(final String uriStr) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                if (System.getProperty("os.name").equals("Linux")
                        && System.getProperty("java.vendor").startsWith("Red Hat")) {
                    try {
                        new ProcessBuilder("xdg-open", uriStr).start();
                    } catch (IOException ex) {
                    }
                } else {
                    Desktop desktop;
                    if (Desktop.isDesktopSupported()) {
                        desktop = Desktop.getDesktop();
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            URI uri;
                            try {
                                uri = new URI(uriStr);
                                desktop.browse(uri);
                            } catch (IOException | URISyntaxException e) {
                            }
                        }
                    }
                }

            }
        }).start();

    }
}
