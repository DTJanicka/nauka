package springinaction.knights;

/**
 * Created by dorota.janicka on 2017-11-15.
 */
public class DamselResciungKnight implements Knight {
    private RescueDemselQuest quest;

    public DamselResciungKnight(){
        this.quest = new RescueDemselQuest();
    }


    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
