package world.bentobox.caveblock;


import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import java.util.*;

import world.bentobox.bentobox.api.configuration.ConfigComment;
import world.bentobox.bentobox.api.configuration.ConfigEntry;
import world.bentobox.bentobox.api.configuration.StoreAt;
import world.bentobox.bentobox.api.configuration.WorldSettings;
import world.bentobox.bentobox.api.flags.Flag;
import world.bentobox.bentobox.database.objects.DataObject;
import world.bentobox.bentobox.database.objects.adapters.Adapter;
import world.bentobox.bentobox.database.objects.adapters.FlagSerializer;
import world.bentobox.bentobox.database.objects.adapters.FlagSerializer2;


/**
 * @author BONNe
 * This class contains all necessary settings fro CaveBlock addon.
 */
@StoreAt(filename="config.yml", path="addons/CaveBlock")
@ConfigComment("CaveBlock Configuration [version]")
@ConfigComment("This config file is dynamic and saved when the server is shutdown.")
@ConfigComment("You cannot edit it while the server is running because changes will")
@ConfigComment("be lost! Use in-game settings GUI or edit when server is offline.")
public class Settings implements DataObject, WorldSettings
{
// ---------------------------------------------------------------------
// Section: Getters
// ---------------------------------------------------------------------


	/**
	 * @return the uniqueId
	 */
	@Override
	public String getUniqueId()
	{
		return this.uniqueId;
	}


	/**
	 * This method returns the friendlyName object.
	 * @return the friendlyName object.
	 */
	@Override
	public String getFriendlyName()
	{
		return friendlyName;
	}


	/**
	 * This method returns the worldName object.
	 * @return the worldName object.
	 */
	@Override
	public String getWorldName()
	{
		return worldName;
	}


	/**
	 * This method returns the difficulty object.
	 * @return the difficulty object.
	 */
	@Override
	public Difficulty getDifficulty()
	{
		return difficulty;
	}


	/**
	 * This method returns the islandDistance object.
	 * @return the islandDistance object.
	 */
	@Override
	public int getIslandDistance()
	{
		return islandDistance;
	}


	/**
	 * This method returns the islandProtectionRange object.
	 * @return the islandProtectionRange object.
	 */
	@Override
	public int getIslandProtectionRange()
	{
		return islandProtectionRange;
	}


	/**
	 * This method returns the islandStartX object.
	 * @return the islandStartX object.
	 */
	@Override
	public int getIslandStartX()
	{
		return islandStartX;
	}


	/**
	 * This method returns the islandStartZ object.
	 * @return the islandStartZ object.
	 */
	@Override
	public int getIslandStartZ()
	{
		return islandStartZ;
	}


	/**
	 * This method returns the islandXOffset object.
	 * @return the islandXOffset object.
	 */
	@Override
	public int getIslandXOffset()
	{
		return islandXOffset;
	}


	/**
	 * This method returns the islandZOffset object.
	 * @return the islandZOffset object.
	 */
	@Override
	public int getIslandZOffset()
	{
		return islandZOffset;
	}


	/**
	 * This method returns the islandHeight object.
	 * @return the islandHeight object.
	 */
	@Override
	public int getIslandHeight()
	{
		return islandHeight;
	}


	/**
	 * This method returns the useOwnGenerator object.
	 * @return the useOwnGenerator object.
	 */
	@Override
	public boolean isUseOwnGenerator()
	{
		return useOwnGenerator;
	}


	/**
	 * This method returns the seaHeight object.
	 * @return the seaHeight object.
	 */
	@Override
	public int getSeaHeight()
	{
		return seaHeight;
	}


	/**
	 * 0 or -1 is unlimited. It will block island creation if the island count for the world is higher than this.
	 * @return the maxIslands
	 */
	@Override
	public int getMaxIslands()
	{
		return maxIslands;
	}


	/**
	 * This method returns the defaultGameMode object.
	 * @return the defaultGameMode object.
	 */
	@Override
	public GameMode getDefaultGameMode()
	{
		return defaultGameMode;
	}


	/**
	 * This method returns the defaultBiome object.
	 * @return the defaultBiome object.
	 */
	public Biome getDefaultBiome()
	{
		return defaultBiome;
	}


	/**
	 * This method returns the banLimit object.
	 * @return the banLimit object.
	 */
	@Override
	public int getBanLimit()
	{
		return banLimit;
	}


	/**
	 * This method returns the netherGenerate object.
	 * @return the netherGenerate object.
	 */
	@Override
	public boolean isNetherGenerate()
	{
		return netherGenerate;
	}


	/**
	 * This method returns the netherIslands object.
	 * @return the netherIslands object.
	 */
	@Override
	public boolean isNetherIslands()
	{
		return netherIslands;
	}


	/**
	 * This method returns the netherTrees object.
	 * @return the netherTrees object.
	 */
	@Override
	public boolean isNetherTrees()
	{
		return netherTrees;
	}


	/**
	 * This method returns the netherRoof object.
	 * @return the netherRoof object.
	 */
	public boolean isNetherRoof()
	{
		return netherRoof;
	}


	/**
	 * This method returns the netherSpawnRadius object.
	 * @return the netherSpawnRadius object.
	 */
	@Override
	public int getNetherSpawnRadius()
	{
		return netherSpawnRadius;
	}


	/**
	 * This method returns the endGenerate object.
	 * @return the endGenerate object.
	 */
	@Override
	public boolean isEndGenerate()
	{
		return endGenerate;
	}


	/**
	 * This method returns the endIslands object.
	 * @return the endIslands object.
	 */
	@Override
	public boolean isEndIslands()
	{
		return endIslands;
	}


	/**
	 * This method returns the dragonSpawn object.
	 * @return the dragonSpawn object.
	 */
	@Override
	public boolean isDragonSpawn()
	{
		return dragonSpawn;
	}


	/**
	 * This method returns the removeMobsWhitelist object.
	 * @return the removeMobsWhitelist object.
	 */
	@Override
	public Set<EntityType> getRemoveMobsWhitelist()
	{
		return removeMobsWhitelist;
	}


	/**
	 * This method returns the worldFlags object.
	 * @return the worldFlags object.
	 */
	@Override
	public Map<String, Boolean> getWorldFlags()
	{
		return worldFlags;
	}


	/**
	 * This method returns the defaultIslandFlags object.
	 * @return the defaultIslandFlags object.
	 */
	@Override
	public Map<Flag, Integer> getDefaultIslandFlags()
	{
		return defaultIslandFlags;
	}


	/**
	 * This method returns the defaultIslandSettings object.
	 * @return the defaultIslandSettings object.
	 */
	@Override
	public Map<Flag, Integer> getDefaultIslandSettings()
	{
		return defaultIslandSettings;
	}


	/**
	 * This method returns the visibleSettings object.
	 * @return the visibleSettings object.
	 */
	@Override
	public List<String> getVisibleSettings()
	{
		return visibleSettings;
	}


	/**
	 * This method returns the visitorBannedCommands object.
	 * @return the visitorBannedCommands object.
	 */
	@Override
	public List<String> getVisitorBannedCommands()
	{
		return visitorBannedCommands;
	}


	/**
	 * This method returns the maxTeamSize object.
	 * @return the maxTeamSize object.
	 */
	@Override
	public int getMaxTeamSize()
	{
		return maxTeamSize;
	}


	/**
	 * This method returns the maxHomes object.
	 * @return the maxHomes object.
	 */
	@Override
	public int getMaxHomes()
	{
		return maxHomes;
	}


	/**
	 * This method returns the resetLimit object.
	 * @return the resetLimit object.
	 */
	@Override
	public int getResetLimit()
	{
		return resetLimit;
	}


	/**
	 * This method returns the resetConfirmation object.
	 * @return the resetConfirmation object.
	 */
	public boolean isResetConfirmation()
	{
		return resetConfirmation;
	}


	/**
	 * This method returns the leaversLoseReset object.
	 * @return the leaversLoseReset object.
	 */
	public boolean isLeaversLoseReset()
	{
		return leaversLoseReset;
	}


	/**
	 * This method returns the kickedKeepInventory object.
	 * @return the kickedKeepInventory object.
	 */
	public boolean isKickedKeepInventory()
	{
		return kickedKeepInventory;
	}


	/**
	 * This method returns the onJoinResetMoney object.
	 * @return the onJoinResetMoney object.
	 */
	@Override
	public boolean isOnJoinResetMoney()
	{
		return onJoinResetMoney;
	}


	/**
	 * This method returns the onJoinResetInventory object.
	 * @return the onJoinResetInventory object.
	 */
	@Override
	public boolean isOnJoinResetInventory()
	{
		return onJoinResetInventory;
	}


	/**
	 * This method returns the onJoinResetEnderChest object.
	 * @return the onJoinResetEnderChest object.
	 */
	@Override
	public boolean isOnJoinResetEnderChest()
	{
		return onJoinResetEnderChest;
	}


	/**
	 * This method returns the onLeaveResetMoney object.
	 * @return the onLeaveResetMoney object.
	 */
	@Override
	public boolean isOnLeaveResetMoney()
	{
		return onLeaveResetMoney;
	}


	/**
	 * This method returns the onLeaveResetInventory object.
	 * @return the onLeaveResetInventory object.
	 */
	@Override
	public boolean isOnLeaveResetInventory()
	{
		return onLeaveResetInventory;
	}


	/**
	 * This method returns the onLeaveResetEnderChest object.
	 * @return the onLeaveResetEnderChest object.
	 */
	@Override
	public boolean isOnLeaveResetEnderChest()
	{
		return onLeaveResetEnderChest;
	}


	/**
	 * This method returns the respawnOnIsland object.
	 * @return the respawnOnIsland object.
	 */
	public boolean isRespawnOnIsland()
	{
		return respawnOnIsland;
	}


	/**
	 * This method returns the allowSetHomeInNether object.
	 * @return the allowSetHomeInNether object.
	 */
	@Override
	public boolean isAllowSetHomeInNether()
	{
		return allowSetHomeInNether;
	}


	/**
	 * This method returns the requireConfirmationToSetHomeInNether object.
	 * @return the requireConfirmationToSetHomeInNether object.
	 */
	@Override
	public boolean isRequireConfirmationToSetHomeInNether()
	{
		return requireConfirmationToSetHomeInNether;
	}


	/**
	 * This method returns the allowSetHomeInTheEnd object.
	 * @return the allowSetHomeInTheEnd object.
	 */
	@Override
	public boolean isAllowSetHomeInTheEnd()
	{
		return allowSetHomeInTheEnd;
	}


	/**
	 * This method returns the requireConfirmationToSetHomeInTheEnd object.
	 * @return the requireConfirmationToSetHomeInTheEnd object.
	 */
	@Override
	public boolean isRequireConfirmationToSetHomeInTheEnd()
	{
		return requireConfirmationToSetHomeInTheEnd;
	}


	/**
	 * This method returns the deathsCounted object.
	 * @return the deathsCounted object.
	 */
	@Override
	public boolean isDeathsCounted()
	{
		return deathsCounted;
	}


	/**
	 * This method returns the deathsMax object.
	 * @return the deathsMax object.
	 */
	@Override
	public int getDeathsMax()
	{
		return deathsMax;
	}


	/**
	 * This method returns the deathsSumTeam object.
	 * @return the deathsSumTeam object.
	 */
	public boolean isDeathsSumTeam()
	{
		return deathsSumTeam;
	}


	/**
	 * This method returns the teamJoinDeathReset object.
	 * @return the teamJoinDeathReset object.
	 */
	@Override
	public boolean isTeamJoinDeathReset()
	{
		return teamJoinDeathReset;
	}


	/**
	 * This method returns the geoLimitSettings object.
	 * @return the geoLimitSettings object.
	 */
	@Override
	public List<String> getGeoLimitSettings()
	{
		return geoLimitSettings;
	}


	/**
	 * This method returns the ivSettings object.
	 * @return the ivSettings object.
	 */
	@Override
	public List<String> getIvSettings()
	{
		return ivSettings;
	}


	/**
	 * This method returns the closePanelOnClickOutside object.
	 * @return the closePanelOnClickOutside object.
	 */
	public boolean isClosePanelOnClickOutside()
	{
		return closePanelOnClickOutside;
	}


	/**
	 * @return the permission prefix
	 */
	@Override
	public String getPermissionPrefix()
	{
		return "caveblock";
	}


	/**
	 * @return true if water is not safe in this world, e.g, should not be a home location
	 */
	@Override
	public boolean isWaterUnsafe()
	{
		return false;
	}


	/**
	 * This method returns the resetEpoch object.
	 * @return the resetEpoch object.
	 */
	@Override
	public long getResetEpoch()
	{
		return resetEpoch;
	}


	public int getWorldDepth()
	{
		return worldDepth;
	}


	public boolean isNormalRoof()
	{
		return normalRoof;
	}


	public boolean isNormalFloor()
	{
		return normalFloor;
	}


	public Material getNormalMainBlock()
	{
		return normalMainBlock;
	}


	public List<String> getNormalBlocks()
	{
		return normalBlocks;
	}


	public boolean isNetherFloor()
	{
		return netherFloor;
	}


	public Material getNetherMainBlock()
	{
		return netherMainBlock;
	}


	public List<String> getNetherBlocks()
	{
		return netherBlocks;
	}


	public boolean isEndRoof()
	{
		return endRoof;
	}


	public boolean isEndFloor()
	{
		return endFloor;
	}


	public Material getEndMainBlock()
	{
		return endMainBlock;
	}


	public List<String> getEndBlocks()
	{
		return endBlocks;
	}


// ---------------------------------------------------------------------
// Section: Setters
// ---------------------------------------------------------------------


	/**
	 * @param uniqueId - unique ID the uniqueId to set
	 */
	@Override
	public void setUniqueId(String uniqueId)
	{
		this.uniqueId = uniqueId;
	}


	/**
	 * This method sets the friendlyName object value.
	 * @param friendlyName the friendlyName object new value.
	 *
	 */
	public void setFriendlyName(String friendlyName)
	{
		this.friendlyName = friendlyName;
	}


	/**
	 * This method sets the worldName object value.
	 * @param worldName the worldName object new value.
	 *
	 */
	public void setWorldName(String worldName)
	{
		this.worldName = worldName;
	}


	/**
	 * This method sets the difficulty object value.
	 * @param difficulty the difficulty object new value.
	 *
	 */
	@Override
	public void setDifficulty(Difficulty difficulty)
	{
		this.difficulty = difficulty;
	}


	/**
	 * This method sets the islandDistance object value.
	 * @param islandDistance the islandDistance object new value.
	 *
	 */
	public void setIslandDistance(int islandDistance)
	{
		this.islandDistance = islandDistance;
	}


	/**
	 * This method sets the islandProtectionRange object value.
	 * @param islandProtectionRange the islandProtectionRange object new value.
	 *
	 */
	public void setIslandProtectionRange(int islandProtectionRange)
	{
		this.islandProtectionRange = islandProtectionRange;
	}


	/**
	 * This method sets the islandStartX object value.
	 * @param islandStartX the islandStartX object new value.
	 *
	 */
	public void setIslandStartX(int islandStartX)
	{
		this.islandStartX = islandStartX;
	}


	/**
	 * This method sets the islandStartZ object value.
	 * @param islandStartZ the islandStartZ object new value.
	 *
	 */
	public void setIslandStartZ(int islandStartZ)
	{
		this.islandStartZ = islandStartZ;
	}


	/**
	 * This method sets the islandXOffset object value.
	 * @param islandXOffset the islandXOffset object new value.
	 *
	 */
	public void setIslandXOffset(int islandXOffset)
	{
		this.islandXOffset = islandXOffset;
	}


	/**
	 * This method sets the islandZOffset object value.
	 * @param islandZOffset the islandZOffset object new value.
	 *
	 */
	public void setIslandZOffset(int islandZOffset)
	{
		this.islandZOffset = islandZOffset;
	}


	/**
	 * This method sets the islandHeight object value.
	 * @param islandHeight the islandHeight object new value.
	 *
	 */
	public void setIslandHeight(int islandHeight)
	{
		this.islandHeight = islandHeight;
	}


	/**
	 * This method sets the useOwnGenerator object value.
	 * @param useOwnGenerator the useOwnGenerator object new value.
	 *
	 */
	public void setUseOwnGenerator(boolean useOwnGenerator)
	{
		this.useOwnGenerator = useOwnGenerator;
	}


	/**
	 * This method sets the seaHeight object value.
	 * @param seaHeight the seaHeight object new value.
	 *
	 */
	public void setSeaHeight(int seaHeight)
	{
		this.seaHeight = seaHeight;
	}


	/**
	 * This method sets the maxIslands object value.
	 * @param maxIslands the maxIslands object new value.
	 *
	 */
	public void setMaxIslands(int maxIslands)
	{
		this.maxIslands = maxIslands;
	}


	/**
	 * This method sets the defaultGameMode object value.
	 * @param defaultGameMode the defaultGameMode object new value.
	 *
	 */
	public void setDefaultGameMode(GameMode defaultGameMode)
	{
		this.defaultGameMode = defaultGameMode;
	}


	/**
	 * This method sets the defaultBiome object value.
	 * @param defaultBiome the defaultBiome object new value.
	 *
	 */
	public void setDefaultBiome(Biome defaultBiome)
	{
		this.defaultBiome = defaultBiome;
	}


	/**
	 * This method sets the banLimit object value.
	 * @param banLimit the banLimit object new value.
	 *
	 */
	public void setBanLimit(int banLimit)
	{
		this.banLimit = banLimit;
	}


	/**
	 * This method sets the netherGenerate object value.
	 * @param netherGenerate the netherGenerate object new value.
	 *
	 */
	public void setNetherGenerate(boolean netherGenerate)
	{
		this.netherGenerate = netherGenerate;
	}


	/**
	 * This method sets the netherIslands object value.
	 * @param netherIslands the netherIslands object new value.
	 *
	 */
	public void setNetherIslands(boolean netherIslands)
	{
		this.netherIslands = netherIslands;
	}


	/**
	 * This method sets the netherTrees object value.
	 * @param netherTrees the netherTrees object new value.
	 *
	 */
	public void setNetherTrees(boolean netherTrees)
	{
		this.netherTrees = netherTrees;
	}


	/**
	 * This method sets the netherRoof object value.
	 * @param netherRoof the netherRoof object new value.
	 *
	 */
	public void setNetherRoof(boolean netherRoof)
	{
		this.netherRoof = netherRoof;
	}


	/**
	 * This method sets the netherSpawnRadius object value.
	 * @param netherSpawnRadius the netherSpawnRadius object new value.
	 *
	 */
	public void setNetherSpawnRadius(int netherSpawnRadius)
	{
		this.netherSpawnRadius = netherSpawnRadius;
	}


	/**
	 * This method sets the endGenerate object value.
	 * @param endGenerate the endGenerate object new value.
	 *
	 */
	public void setEndGenerate(boolean endGenerate)
	{
		this.endGenerate = endGenerate;
	}


	/**
	 * This method sets the endIslands object value.
	 * @param endIslands the endIslands object new value.
	 *
	 */
	public void setEndIslands(boolean endIslands)
	{
		this.endIslands = endIslands;
	}


	/**
	 * This method sets the dragonSpawn object value.
	 * @param dragonSpawn the dragonSpawn object new value.
	 *
	 */
	public void setDragonSpawn(boolean dragonSpawn)
	{
		this.dragonSpawn = dragonSpawn;
	}


	/**
	 * This method sets the removeMobsWhitelist object value.
	 * @param removeMobsWhitelist the removeMobsWhitelist object new value.
	 *
	 */
	public void setRemoveMobsWhitelist(Set<EntityType> removeMobsWhitelist)
	{
		this.removeMobsWhitelist = removeMobsWhitelist;
	}


	/**
	 * This method sets the worldFlags object value.
	 * @param worldFlags the worldFlags object new value.
	 *
	 */
	public void setWorldFlags(Map<String, Boolean> worldFlags)
	{
		this.worldFlags = worldFlags;
	}


	/**
	 * This method sets the defaultIslandFlags object value.
	 * @param defaultIslandFlags the defaultIslandFlags object new value.
	 *
	 */
	public void setDefaultIslandFlags(Map<Flag, Integer> defaultIslandFlags)
	{
		this.defaultIslandFlags = defaultIslandFlags;
	}


	/**
	 * This method sets the defaultIslandSettings object value.
	 * @param defaultIslandSettings the defaultIslandSettings object new value.
	 *
	 */
	public void setDefaultIslandSettings(Map<Flag, Integer> defaultIslandSettings)
	{
		this.defaultIslandSettings = defaultIslandSettings;
	}


	/**
	 * This method sets the visibleSettings object value.
	 * @param visibleSettings the visibleSettings object new value.
	 *
	 */
	public void setVisibleSettings(List<String> visibleSettings)
	{
		this.visibleSettings = visibleSettings;
	}


	/**
	 * This method sets the visitorBannedCommands object value.
	 * @param visitorBannedCommands the visitorBannedCommands object new value.
	 *
	 */
	public void setVisitorBannedCommands(List<String> visitorBannedCommands)
	{
		this.visitorBannedCommands = visitorBannedCommands;
	}


	/**
	 * This method sets the maxTeamSize object value.
	 * @param maxTeamSize the maxTeamSize object new value.
	 *
	 */
	public void setMaxTeamSize(int maxTeamSize)
	{
		this.maxTeamSize = maxTeamSize;
	}


	/**
	 * This method sets the maxHomes object value.
	 * @param maxHomes the maxHomes object new value.
	 *
	 */
	public void setMaxHomes(int maxHomes)
	{
		this.maxHomes = maxHomes;
	}


	/**
	 * This method sets the resetLimit object value.
	 * @param resetLimit the resetLimit object new value.
	 *
	 */
	public void setResetLimit(int resetLimit)
	{
		this.resetLimit = resetLimit;
	}


	/**
	 * This method sets the resetConfirmation object value.
	 * @param resetConfirmation the resetConfirmation object new value.
	 *
	 */
	public void setResetConfirmation(boolean resetConfirmation)
	{
		this.resetConfirmation = resetConfirmation;
	}


	/**
	 * This method sets the leaversLoseReset object value.
	 * @param leaversLoseReset the leaversLoseReset object new value.
	 *
	 */
	public void setLeaversLoseReset(boolean leaversLoseReset)
	{
		this.leaversLoseReset = leaversLoseReset;
	}


	/**
	 * This method sets the kickedKeepInventory object value.
	 * @param kickedKeepInventory the kickedKeepInventory object new value.
	 *
	 */
	public void setKickedKeepInventory(boolean kickedKeepInventory)
	{
		this.kickedKeepInventory = kickedKeepInventory;
	}


	/**
	 * This method sets the onJoinResetMoney object value.
	 * @param onJoinResetMoney the onJoinResetMoney object new value.
	 *
	 */
	public void setOnJoinResetMoney(boolean onJoinResetMoney)
	{
		this.onJoinResetMoney = onJoinResetMoney;
	}


	/**
	 * This method sets the onJoinResetInventory object value.
	 * @param onJoinResetInventory the onJoinResetInventory object new value.
	 *
	 */
	public void setOnJoinResetInventory(boolean onJoinResetInventory)
	{
		this.onJoinResetInventory = onJoinResetInventory;
	}


	/**
	 * This method sets the onJoinResetEnderChest object value.
	 * @param onJoinResetEnderChest the onJoinResetEnderChest object new value.
	 *
	 */
	public void setOnJoinResetEnderChest(boolean onJoinResetEnderChest)
	{
		this.onJoinResetEnderChest = onJoinResetEnderChest;
	}


	/**
	 * This method sets the onLeaveResetMoney object value.
	 * @param onLeaveResetMoney the onLeaveResetMoney object new value.
	 *
	 */
	public void setOnLeaveResetMoney(boolean onLeaveResetMoney)
	{
		this.onLeaveResetMoney = onLeaveResetMoney;
	}


	/**
	 * This method sets the onLeaveResetInventory object value.
	 * @param onLeaveResetInventory the onLeaveResetInventory object new value.
	 *
	 */
	public void setOnLeaveResetInventory(boolean onLeaveResetInventory)
	{
		this.onLeaveResetInventory = onLeaveResetInventory;
	}


	/**
	 * This method sets the onLeaveResetEnderChest object value.
	 * @param onLeaveResetEnderChest the onLeaveResetEnderChest object new value.
	 *
	 */
	public void setOnLeaveResetEnderChest(boolean onLeaveResetEnderChest)
	{
		this.onLeaveResetEnderChest = onLeaveResetEnderChest;
	}


	/**
	 * This method sets the respawnOnIsland object value.
	 * @param respawnOnIsland the respawnOnIsland object new value.
	 *
	 */
	public void setRespawnOnIsland(boolean respawnOnIsland)
	{
		this.respawnOnIsland = respawnOnIsland;
	}


	/**
	 * This method sets the allowSetHomeInNether object value.
	 * @param allowSetHomeInNether the allowSetHomeInNether object new value.
	 *
	 */
	public void setAllowSetHomeInNether(boolean allowSetHomeInNether)
	{
		this.allowSetHomeInNether = allowSetHomeInNether;
	}


	/**
	 * This method sets the requireConfirmationToSetHomeInNether object value.
	 * @param requireConfirmationToSetHomeInNether the requireConfirmationToSetHomeInNether object new value.
	 *
	 */
	public void setRequireConfirmationToSetHomeInNether(boolean requireConfirmationToSetHomeInNether)
	{
		this.requireConfirmationToSetHomeInNether = requireConfirmationToSetHomeInNether;
	}


	/**
	 * This method sets the allowSetHomeInTheEnd object value.
	 * @param allowSetHomeInTheEnd the allowSetHomeInTheEnd object new value.
	 *
	 */
	public void setAllowSetHomeInTheEnd(boolean allowSetHomeInTheEnd)
	{
		this.allowSetHomeInTheEnd = allowSetHomeInTheEnd;
	}


	/**
	 * This method sets the requireConfirmationToSetHomeInTheEnd object value.
	 * @param requireConfirmationToSetHomeInTheEnd the requireConfirmationToSetHomeInTheEnd object new value.
	 *
	 */
	public void setRequireConfirmationToSetHomeInTheEnd(boolean requireConfirmationToSetHomeInTheEnd)
	{
		this.requireConfirmationToSetHomeInTheEnd = requireConfirmationToSetHomeInTheEnd;
	}


	/**
	 * This method sets the deathsCounted object value.
	 * @param deathsCounted the deathsCounted object new value.
	 *
	 */
	public void setDeathsCounted(boolean deathsCounted)
	{
		this.deathsCounted = deathsCounted;
	}


	/**
	 * This method sets the deathsMax object value.
	 * @param deathsMax the deathsMax object new value.
	 *
	 */
	public void setDeathsMax(int deathsMax)
	{
		this.deathsMax = deathsMax;
	}


	/**
	 * This method sets the deathsSumTeam object value.
	 * @param deathsSumTeam the deathsSumTeam object new value.
	 *
	 */
	public void setDeathsSumTeam(boolean deathsSumTeam)
	{
		this.deathsSumTeam = deathsSumTeam;
	}


	/**
	 * This method sets the teamJoinDeathReset object value.
	 * @param teamJoinDeathReset the teamJoinDeathReset object new value.
	 *
	 */
	public void setTeamJoinDeathReset(boolean teamJoinDeathReset)
	{
		this.teamJoinDeathReset = teamJoinDeathReset;
	}


	/**
	 * This method sets the geoLimitSettings object value.
	 * @param geoLimitSettings the geoLimitSettings object new value.
	 *
	 */
	public void setGeoLimitSettings(List<String> geoLimitSettings)
	{
		this.geoLimitSettings = geoLimitSettings;
	}


	/**
	 * This method sets the ivSettings object value.
	 * @param ivSettings the ivSettings object new value.
	 *
	 */
	public void setIvSettings(List<String> ivSettings)
	{
		this.ivSettings = ivSettings;
	}


	/**
	 * This method sets the closePanelOnClickOutside object value.
	 * @param closePanelOnClickOutside the closePanelOnClickOutside object new value.
	 *
	 */
	public void setClosePanelOnClickOutside(boolean closePanelOnClickOutside)
	{
		this.closePanelOnClickOutside = closePanelOnClickOutside;
	}


	/**
	 * This method sets the resetEpoch object value.
	 * @param resetEpoch the resetEpoch object new value.
	 *
	 */
	@Override
	public void setResetEpoch(long resetEpoch)
	{
		this.resetEpoch = resetEpoch;
	}


	public void setWorldDepth(int worldDepth)
	{
		this.worldDepth = worldDepth;
	}


	public void setNormalRoof(boolean normalRoof)
	{
		this.normalRoof = normalRoof;
	}


	public void setNormalFloor(boolean normalFloor)
	{
		this.normalFloor = normalFloor;
	}


	public void setNormalMainBlock(Material normalMainBlock)
	{
		this.normalMainBlock = normalMainBlock;
	}


	public void setNormalBlocks(List<String> normalBlocks)
	{
		this.normalBlocks = normalBlocks;
	}


	public void setNetherFloor(boolean netherFloor)
	{
		this.netherFloor = netherFloor;
	}


	public void setNetherMainBlock(Material netherMainBlock)
	{
		this.netherMainBlock = netherMainBlock;
	}


	public void setNetherBlocks(List<String> netherBlocks)
	{
		this.netherBlocks = netherBlocks;
	}


	public void setEndRoof(boolean endRoof)
	{
		this.endRoof = endRoof;
	}


	public void setEndFloor(boolean endFloor)
	{
		this.endFloor = endFloor;
	}


	public void setEndMainBlock(Material endMainBlock)
	{
		this.endMainBlock = endMainBlock;
	}


	public void setEndBlocks(List<String> endBlocks)
	{
		this.endBlocks = endBlocks;
	}


// ---------------------------------------------------------------------
// Section: Variables
// ---------------------------------------------------------------------


	/*      WORLD       */
	@ConfigComment("Friendly name for this world. Used in admin commands. Must be a single word")
	@ConfigEntry(path = "world.friendly-name")
	private String friendlyName = "CaveBlock";

	@ConfigComment("Name of the world - if it does not exist then it will be generated.")
	@ConfigComment("It acts like a prefix for nether and end (e.g. CaveBlock-world, CaveBlock-world_nether, CaveBlock-world_end)")
	@ConfigEntry(path = "world.world-name")
	private String worldName = "CaveBlock-world";

	@ConfigComment("World difficulty setting - PEACEFUL, EASY, NORMAL, HARD")
	@ConfigComment("Other plugins may override this setting")
	@ConfigEntry(path = "world.difficulty")
	private Difficulty difficulty = Difficulty.NORMAL;

	@ConfigComment("Radius of island in blocks. (So distance between islands is twice this)")
	@ConfigComment("Will be rounded up to the nearest 16 blocks.")
	@ConfigComment("It is the same for every dimension : Overworld, Nether and End.")
	@ConfigComment("This value cannot be changed mid-game and the plugin will not start if it is different.")
	@ConfigEntry(path = "world.distance-between-islands", needsReset = true)
	private int islandDistance = 100;

	@ConfigComment("Default protection range radius in blocks. Cannot be larger than distance.")
	@ConfigComment("Admins can change protection sizes for players individually using /cbadmin range set <player> <new range>")
	@ConfigComment("or set this permission: caveblock.island.range.<number>")
	@ConfigEntry(path = "world.protection-range")
	private int islandProtectionRange = 50;

	@ConfigComment("Start islands at these coordinates. This is where new islands will start in the")
	@ConfigComment("world. These must be a factor of your island distance, but the plugin will auto")
	@ConfigComment("calculate the closest location on the grid. Islands develop around this location")
	@ConfigComment("both positively and negatively in a square grid.")
	@ConfigComment("If none of this makes sense, leave it at 0,0.")
	@ConfigEntry(path = "world.start-x", needsReset = true)
	private int islandStartX = 0;

	@ConfigEntry(path = "world.start-z", needsReset = true)
	private int islandStartZ = 0;

	@ConfigEntry(path = "world.offset-x")
	private int islandXOffset;
	@ConfigEntry(path = "world.offset-z")
	private int islandZOffset;

	@ConfigComment("Island height - Lowest is 5.")
	@ConfigComment("It is the y coordinate of the bedrock block in the schem.")
	@ConfigEntry(path = "world.island-height")
	private int islandHeight = 60;

	@ConfigComment("Use your own world generator for this world.")
	@ConfigComment("In this case, the plugin will not generate anything.")
	@ConfigEntry(path = "world.use-own-generator", experimental = true)
	private boolean useOwnGenerator = true;

	@ConfigComment("Sea height (don't changes this mid-game unless you delete the world)")
	@ConfigComment("Minimum is 0, which means you are playing CaveBlock!")
	@ConfigComment("If sea height is less than about 10, then players will drop right through it")
	@ConfigComment("if it exists. Makes for an interesting variation on caveblock.")
	@ConfigEntry(path = "world.sea-height", needsReset = true)
	private int seaHeight = 0;

	@ConfigComment("Maximum number of islands in the world. Set to -1 or 0 for unlimited.")
	@ConfigComment("If the number of islands is greater than this number, it will stop players from creating islands.")
	@ConfigEntry(path = "world.max-islands")
	private int maxIslands = -1;

	@ConfigComment("The default game mode for this world. Players will be set to this mode when they create")
	@ConfigComment("a new island for example. Options are SURVIVAL, CREATIVE, ADVENTURE, SPECTATOR")
	@ConfigEntry(path = "world.default-game-mode")
	private GameMode defaultGameMode = GameMode.SURVIVAL;

	@ConfigComment("The default biome for the overworld")
	@ConfigEntry(path = "world.default-biome")
	private Biome defaultBiome = Biome.MOUNTAINS;

	@ConfigComment("The maximum number of players a player can ban at any one time in this game mode.")
	@ConfigComment("The permission acidisland.ban.maxlimit.X where X is a number can also be used per player")
	@ConfigComment("-1 = unlimited")
	@ConfigEntry(path = "world.ban-limit")
	private int banLimit = -1;

	@ConfigComment("")
	@ConfigComment("This is cave... no height... only depth. Max 256.")
	@ConfigComment("Should not be less then island height.")
	@ConfigEntry(path = "world.world-depth")
	private int worldDepth = 256;

	@ConfigComment("")
	@ConfigComment("Make over world roof of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.normal.roof")
	private boolean normalRoof = true;

	@ConfigComment("Make over world floor of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.normal.floor")
	private boolean normalFloor = true;

	@ConfigComment("Main block of which world will be generated.")
	@ConfigEntry(path = "world.normal.main-block")
	private Material normalMainBlock = Material.STONE;

	@ConfigComment("Rare blocks that will be randomly placed around world. 1-material, 2-rarity, 3-pack size")
	@ConfigComment("F.E. DIAMOND_ORE:1:3 means that diamond has ~0.1% chance being spawned and max of 3 blocks.")
	@ConfigComment("Rarity index can be over 100. It will be summed and rarity for block will be BLOCK_RARITY/RARITY_SUM * 10.")
	@ConfigEntry(path = "world.normal.blocks")
	private List<String> normalBlocks = new ArrayList<>();

	// Nether
	@ConfigComment("Generate Nether - if this is false, the nether world will not be made and access to")
	@ConfigComment("the nether will not occur. Other plugins may still enable portal usage.")
	@ConfigComment("Note: Some default challenges will not be possible if there is no nether.")
	@ConfigComment("Note that with a standard nether all players arrive at the same portal and entering a")
	@ConfigComment("portal will return them back to their islands.")
	@ConfigEntry(path = "world.nether.generate")
	private boolean netherGenerate = true;

	@ConfigComment("Islands in Nether. Change to false for standard vanilla nether.")
	@ConfigEntry(path = "world.nether.islands", needsReset = true)
	private boolean netherIslands = true;

	@ConfigComment("Nether trees are made if a player grows a tree in the nether (gravel and glowstone)")
	@ConfigComment("Applies to both vanilla and islands Nether")
	@ConfigEntry(path = "world.nether.trees")
	private boolean netherTrees = true;

	@ConfigComment("Nether spawn protection radius - this is the distance around the nether spawn")
	@ConfigComment("that will be protected from player interaction (breaking blocks, pouring lava etc.)")
	@ConfigComment("Minimum is 0 (not recommended), maximum is 100. Default is 25.")
	@ConfigComment("Only applies to vanilla nether")
	@ConfigEntry(path = "world.nether.spawn-radius")
	private int netherSpawnRadius = 32;

	@ConfigComment("Make over world roof of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.nether.roof")
	private boolean netherRoof = true;

	@ConfigComment("Make over world floor of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.nether.floor")
	private boolean netherFloor = true;

	@ConfigComment("Main block of which world will be generated.")
	@ConfigEntry(path = "world.nether.main-block")
	private Material netherMainBlock = Material.STONE;

	@ConfigComment("Rare blocks that will be randomly placed around world. 1-material, 2-rarity, 3-pack size")
	@ConfigComment("F.E. DIAMOND_ORE:1:3 means that diamond has ~0.1% chance being spawned and max of 3 blocks.")
	@ConfigComment("Rarity index can be over 100. It will be summed and rarity for block will be BLOCK_RARITY/RARITY_SUM * 10.")
	@ConfigEntry(path = "world.nether.blocks")
	private List<String> netherBlocks = new ArrayList<>();

	// End
	@ConfigEntry(path = "world.end.generate")
	private boolean endGenerate = true;

	@ConfigEntry(path = "world.end.islands", needsReset = true)
	private boolean endIslands = true;

	@ConfigEntry(path = "world.end.dragon-spawn", experimental = true)
	private boolean dragonSpawn = false;

	@ConfigComment("Make over world roof of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.end.roof")
	private boolean endRoof = true;

	@ConfigComment("Make over world floor of bedrock, if false, it will be made from stone")
	@ConfigEntry(path = "world.end.floor")
	private boolean endFloor = true;

	@ConfigComment("Main block of which world will be generated.")
	@ConfigEntry(path = "world.end.main-block")
	private Material endMainBlock = Material.STONE;

	@ConfigComment("Rare blocks that will be randomly placed around world. 1-material, 2-rarity, 3-pack size")
	@ConfigComment("F.E. DIAMOND_ORE:1:3 means that diamond has ~0.1% chance being spawned and max of 3 blocks.")
	@ConfigComment("Rarity index can be over 100. It will be summed and rarity for block will be BLOCK_RARITY/RARITY_SUM * 10.")
	@ConfigEntry(path = "world.end.blocks")
	private List<String> endBlocks = new ArrayList<>();

	// Other staff.

	@ConfigComment("Mob white list - these mobs will NOT be removed when logging in or doing /cave")
	@ConfigEntry(path = "world.remove-mobs-whitelist")
	private Set<EntityType> removeMobsWhitelist = new HashSet<>();

	@ConfigComment("World flags. These are boolean settings for various flags for this world")
	@ConfigEntry(path = "world.flags")
	private Map<String, Boolean> worldFlags = new HashMap<>();

	@ConfigComment("These are the default protection settings for new islands.")
	@ConfigComment("The value is the minimum island rank required allowed to do the action")
	@ConfigComment("Ranks are: Visitor = 0, Member = 900, Owner = 1000")
	@ConfigEntry(path = "world.default-island-flags")
	@Adapter(FlagSerializer.class)
	private Map<Flag, Integer> defaultIslandFlags = new HashMap<>();

	@ConfigComment("These are the default settings for new islands")
	@ConfigEntry(path = "world.default-island-settings")
	@Adapter(FlagSerializer2.class)
	private Map<Flag, Integer> defaultIslandSettings = new HashMap<>();

	@ConfigComment("These are the settings visible to users. (Not implemented yet)")
	@ConfigEntry(path = "world.visible-settings", experimental = true)
	private List<String> visibleSettings = new ArrayList<>();

	@ConfigComment("Visitor banned commands - Visitors to islands cannot use these commands in this world")
	@ConfigEntry(path = "world.visitor-banned-commands")
	private List<String> visitorBannedCommands = new ArrayList<>();

	// ---------------------------------------------

	/*      ISLAND      */
	@ConfigComment("Default max team size")
	@ConfigComment("Permission size cannot be less than the default below. ")
	@ConfigEntry(path = "island.max-team-size")
	private int maxTeamSize = 4;

	@ConfigComment("Default maximum number of homes a player can have. Min = 1")
	@ConfigComment("Accessed via /cave sethome <number> or /cave go <number>")
	@ConfigEntry(path = "island.max-homes")
	private int maxHomes = 5;

	// Reset
	@ConfigComment("How many resets a player is allowed (override with /cbadmin clearresets <player>)")
	@ConfigComment("Value of -1 means unlimited, 0 means hardcore - no resets.")
	@ConfigComment("Example, 2 resets means they get 2 resets or 3 islands lifetime")
	@ConfigEntry(path = "island.reset.reset-limit")
	private int resetLimit = -1;

	@ConfigEntry(path = "island.require-confirmation.reset")
	private boolean resetConfirmation = true;

	@ConfigComment("Kicked or leaving players lose resets")
	@ConfigComment("Players who leave a team will lose an island reset chance")
	@ConfigComment("If a player has zero resets left and leaves a team, they cannot make a new")
	@ConfigComment("island by themselves and can only join a team.")
	@ConfigComment("Leave this true to avoid players exploiting free islands")
	@ConfigEntry(path = "island.reset.leavers-lose-reset")
	private boolean leaversLoseReset = false;

	@ConfigComment("Allow kicked players to keep their inventory.")
	@ConfigComment("If false, kicked player's inventory will be thrown at the island leader if the")
	@ConfigComment("kicked player is online and in the island world.")
	@ConfigEntry(path = "island.reset.kicked-keep-inventory")
	private boolean kickedKeepInventory = false;

	@ConfigComment("What the plugin should reset when the player joins or creates an island")
	@ConfigComment("Reset Money - if this is true, will reset the player's money to the starting money")
	@ConfigComment("Recommendation is that this is set to true, but if you run multi-worlds")
	@ConfigComment("make sure your economy handles multi-worlds too.")
	@ConfigEntry(path = "island.reset.on-join.money")
	private boolean onJoinResetMoney = false;

	@ConfigComment("Reset inventory - if true, the player's inventory will be cleared.")
	@ConfigComment("Note: if you have MultiInv running or a similar inventory control plugin, that")
	@ConfigComment("plugin may still reset the inventory when the world changes.")
	@ConfigEntry(path = "island.reset.on-join.inventory")
	private boolean onJoinResetInventory = false;

	@ConfigComment("Reset Ender Chest - if true, the player's Ender Chest will be cleared.")
	@ConfigEntry(path = "island.reset.on-join.ender-chest")
	private boolean onJoinResetEnderChest = false;

	@ConfigComment("What the plugin should reset when the player leaves or is kicked from an island")
	@ConfigComment("Reset Money - if this is true, will reset the player's money to the starting money")
	@ConfigComment("Recommendation is that this is set to true, but if you run multi-worlds")
	@ConfigComment("make sure your economy handles multi-worlds too.")
	@ConfigEntry(path = "island.reset.on-leave.money")
	private boolean onLeaveResetMoney = false;

	@ConfigComment("Reset inventory - if true, the player's inventory will be cleared.")
	@ConfigComment("Note: if you have MultiInv running or a similar inventory control plugin, that")
	@ConfigComment("plugin may still reset the inventory when the world changes.")
	@ConfigEntry(path = "island.reset.on-leave.inventory")
	private boolean onLeaveResetInventory = false;

	@ConfigComment("Reset Ender Chest - if true, the player's Ender Chest will be cleared.")
	@ConfigEntry(path = "island.reset.on-leave.ender-chest")
	private boolean onLeaveResetEnderChest = false;

	@ConfigComment("Have player's respawn on their island if they die")
	@ConfigEntry(path = "island.respawn-on-island")
	private boolean respawnOnIsland = true;

	// Sethome
	@ConfigEntry(path = "island.sethome.nether.allow")
	private boolean allowSetHomeInNether = true;

	@ConfigEntry(path = "island.sethome.nether.require-confirmation")
	private boolean requireConfirmationToSetHomeInNether = true;

	@ConfigEntry(path = "island.sethome.the-end.allow")
	private boolean allowSetHomeInTheEnd = true;

	@ConfigEntry(path = "island.sethome.the-end.require-confirmation")
	private boolean requireConfirmationToSetHomeInTheEnd = true;

	// Deaths
	@ConfigComment("Whether deaths are counted or not.")
	@ConfigEntry(path = "island.deaths.counted")
	private boolean deathsCounted = true;

	@ConfigComment("Maximum number of deaths to count. The death count can be used by add-ons.")
	@ConfigEntry(path = "island.deaths.max")
	private int deathsMax = 10;

	@ConfigEntry(path = "island.deaths.sum-team")
	private boolean deathsSumTeam = false;

	@ConfigComment("When a player joins a team, reset their death count")
	@ConfigEntry(path = "island.deaths.team-join-reset")
	private boolean teamJoinDeathReset = true;

	// ---------------------------------------------
	/*      PROTECTION      */

	@ConfigComment("Geo restrict mobs.")
	@ConfigComment("Mobs that exit the island space where they were spawned will be removed.")
	@ConfigEntry(path = "protection.geo-limit-settings")
	private List<String> geoLimitSettings = new ArrayList<>();

	// Invincible visitor settings
	@ConfigComment("Invincible visitors. List of damages that will not affect visitors.")
	@ConfigComment("Make list blank if visitors should receive all damages")
	@ConfigEntry(path = "protection.invincible-visitors")
	private List<String> ivSettings = new ArrayList<>();

	//---------------------------------------------------------------------------------------/

	@ConfigComment("Whether GUIs should be closed when the player clicks outside.")
	@ConfigEntry(path = "panel.close-on-click-outside")
	private boolean closePanelOnClickOutside = true;

	//---------------------------------------------------------------------------------------/
	@ConfigComment("These settings should not be edited")
	@ConfigEntry(path = "do-not-edit-these-settings.reset-epoch")
	private long resetEpoch = 0;

	private String uniqueId = "config";
}
