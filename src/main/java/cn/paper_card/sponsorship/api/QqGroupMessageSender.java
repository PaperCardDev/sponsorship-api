package cn.paper_card.sponsorship.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface QqGroupMessageSender {
    void sendNormal(@NotNull String message) throws Exception;

    void sendAt(@Nullable String m1, long target, @Nullable String m2) throws Exception;
}
