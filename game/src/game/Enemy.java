package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class Enemy {

	public static final int NO_PROCESS = -1;
	public static final int MOVEOUT = -2;

	Image pic;// 그림
	int x, y;// 좌표
	int r; // 반지
	public int pow, hp;// 의 위력
	int speed, degree;

	public Enemy(Image pic, int x, int y, int r, int hp, int pow) {
		this.pic = pic;
		this.r = r;
		this.x = x;
		this.y = y;
		this.pow = pow;
		this.hp = hp;
	}

	public void draw(Graphics gc, ImageObserver _ob) {

		gc.drawImage(pic, x - r, y - r, _ob);
	}

}
