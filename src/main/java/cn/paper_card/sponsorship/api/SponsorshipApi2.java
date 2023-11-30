package cn.paper_card.sponsorship.api;


import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface SponsorshipApi2 {

    @NotNull SponsorshipService getSponsorshipService();

    // 赞助提示信息，每个玩家不一样
    void appendPromptMessage(@NotNull Object textComponent, @NotNull UUID uuid);

    // 赞助链接
    @NotNull String getDonationLink();
}
