package levelup.player;

import net.minecraft.nbt.NBTTagCompound;

import java.util.Map;

public interface IPlayerClass
{
    int getSkillFromIndex(String ID);

    byte getPlayerClass();

    Map<String, int[]> getCounterMap();

    NBTTagCompound saveNBTData(NBTTagCompound tag);

    void loadNBTData(NBTTagCompound tag);

    void convertPointsToXp(boolean convert);

    int getSkillPoints();

    boolean hasClass();

    void setPlayerClass(byte type);

    void takeSkillFraction(float resetSkill);

    void addToSkill(String name, int experience);

    int[] getPlayerData(boolean withClass);

    void setPlayerData(int[] data);
}
