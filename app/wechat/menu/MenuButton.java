package wechat.menu;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import wechat.event.EventType;
/**
 * 菜单按钮
 * @author Zhangxs
 * @version 2015-7-4
 */
public class MenuButton {
	private EventType type;//菜单的响应动作类型
	private String name;//菜单标题，不超过16个字节，子菜单不超过40个字节
	private String key;//click等点击类型必须	菜单KEY值，用于消息接口推送，不超过128字节
	private String url;//view类型必须	网页链接，用户点击菜单可打开链接，不超过256字节
	@SerializedName("media_id")
	private String mediaId;//media_id类型和view_limited类型必须	调用新增永久素材接口返回的合法media_id
	@SerializedName("sub_button")
	private List<MenuButton> subButton;//子菜单,每个一级菜单最多包含5个二级菜单
	
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public List<MenuButton> getSubButton() {
		return subButton;
	}
	public void setSubButton(List<MenuButton> subButton) {
		this.subButton = subButton;
	}
	
}
