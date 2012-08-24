package net.egork.chelper.parser;

import java.util.Collection;

/**
 * @author Egor Kulikov (egorku@yandex-team.ru)
 */
public interface DescriptionReceiver {
    public void receiveAdditionalDescriptions(Collection<Description> descriptions);
}
