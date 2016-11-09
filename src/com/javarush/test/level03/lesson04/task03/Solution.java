package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg a = new Zerg();
        a.name = "Z1";
        Zerg b = new Zerg();
        b.name = "Z2";
        Zerg c = new Zerg();
        c.name = "Z3";
        Zerg d = new Zerg();
        d.name = "Z4";
        Zerg e = new Zerg();
        e.name = "Z5";
        Zerg f = new Zerg();
        f.name = "Z6";
        Zerg g = new Zerg();
        g.name = "Z7";
        Zerg h = new Zerg();
        h.name = "Z8";
        Zerg i = new Zerg();
        i.name = "Z9";
        Zerg j = new Zerg();
        j.name = "Z10";

        Protos k = new Protos();
        k.name = "P1";
        Protos l = new Protos();
        l.name = "P2";
        Protos m = new Protos();
        m.name = "P3";
        Protos n = new Protos();
        n.name = "P4";
        Protos o = new Protos();
        o.name = "P5";

        Terran p = new Terran();
        p.name = "T1";
        Terran q = new Terran();
        q.name = "T2";
        Terran r = new Terran();
        r.name = "T3";
        Terran s = new Terran();
        s.name = "T4";
        Terran t = new Terran();
        t.name = "T5";
        Terran u = new Terran();
        u.name = "T6";
        Terran v = new Terran();
        v.name = "T7";
        Terran w = new Terran();
        w.name = "T8";
        Terran x = new Terran();
        x.name = "T9";
        Terran y = new Terran();
        y.name = "T10";
        Terran z = new Terran();
        z.name = "T11";
        Terran one = new Terran();
        one.name = "T12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protos {
        public String name;
    }

    public static class Terran {
        public String name;
    }

}