package net.shenzhong.melody_muncher.gameobject;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.Batch;
import net.shenzhong.melody_muncher.GameObject;

public class SimpleGameObjectWithSprite extends GameObject {
    public Sprite sprite;
    private int z;

    public SimpleGameObjectWithSprite(int z, Texture texture) {
        sprite = new Sprite(texture);
        this.z = z;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public void render(Batch batch) {
        sprite.draw(batch);
    }

    @Override
    public void update(float dt) {
    }
}
