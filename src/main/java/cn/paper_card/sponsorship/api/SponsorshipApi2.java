package cn.paper_card.sponsorship.api;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface SponsorshipApi2 {

    @NotNull SponsorshipService getSponsorshipService();

    // 赞助提示信息，每个玩家不一样
    // joinNo: 进服次数
    // online: 总计在线时长：毫秒
    void appendPromptMessage(@NotNull Object textComponent, @NotNull UUID uuid, long joinNo, long online);

    // 赞助链接
    @NotNull String getDonationLink();

    void setQqGroupMessageSender(@Nullable QqGroupMessageSender sender);

    @Nullable QqGroupMessageSender getQqGroupMessageSender();
}
