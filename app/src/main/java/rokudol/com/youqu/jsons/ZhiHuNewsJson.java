package rokudol.com.youqu.jsons;

import java.util.List;

/**
 * Created by rokudo on 2017/4/11.
 */

public class ZhiHuNewsJson {
	/*
	* @param date:日期
	* @param stories:当日新闻
	*    @param title:新闻标题
	*    @param images:图像地址（官方 API 使用数组形式。目前暂未有使用多张图片的情形出现，曾见无 images 属性的情况，请在使用中注意 ）
	*    @param ga_prefix:供 Google Analytics 使用
	*    @param type:作用未知
	*    @param id:url 与 share_url 中最后的数字（应为内容的 id）
	*    @param multipic:消息是否包含多张图片（仅出现在包含多图的新闻中）
	* @param top_stories:界面顶部 ViewPager 滚动显示的显示内容（子项格式同上）（请注意区分此处的 image 属性与 stories 中的 images 属性）
	* */
	private String date;

	private List<StoriesBean> stories;

	private List<TopStoriesBean> top_stories;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<StoriesBean> getStories() {
		return stories;
	}

	public void setStories(List<StoriesBean> stories) {
		this.stories = stories;
	}

	public List<TopStoriesBean> getTop_stories() {
		return top_stories;
	}

	public void setTop_stories(List<TopStoriesBean> top_stories) {
		this.top_stories = top_stories;
	}

	public static class StoriesBean {
		private int type;
		private int id;
		private String ga_prefix;
		private String title;
		private List<String> images;
		private boolean readState;

		public boolean getReadState() {
			return readState;
		}

		public void setReadState(boolean readState) {
			this.readState = readState;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getGa_prefix() {
			return ga_prefix;
		}

		public void setGa_prefix(String ga_prefix) {
			this.ga_prefix = ga_prefix;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getImages() {
			return images;
		}

		public void setImages(List<String> images) {
			this.images = images;
		}

		@Override
		public String toString() {
			return "StoriesBean{" +
					"type=" + type +
					", id=" + id +
					", ga_prefix='" + ga_prefix + '\'' +
					", title='" + title + '\'' +
					", images=" + images +
					", readState=" + readState +
					'}';
		}
	}

	public static class TopStoriesBean {
		private String image;
		private int type;
		private int id;
		private String ga_prefix;
		private String title;

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getGa_prefix() {
			return ga_prefix;
		}

		public void setGa_prefix(String ga_prefix) {
			this.ga_prefix = ga_prefix;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "TopStoriesBean{" +
					"image='" + image + '\'' +
					", type=" + type +
					", id=" + id +
					", ga_prefix='" + ga_prefix + '\'' +
					", title='" + title + '\'' +
					'}';
		}
	}

	@Override
	public String toString() {
		return "DailyListBean{" +
				"date='" + date + '\'' +
				", stories=" + stories +
				", top_stories=" + top_stories +
				'}';
	}
}
