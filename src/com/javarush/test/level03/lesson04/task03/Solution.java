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
        Zerg ii = new Zerg();
        i.name = "Z11";
        Zerg jj = new Zerg();
        j.name = "Z12";

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
        p.name = "T11";
        Terran q = new Terran();
        q.name = "T12";
        Terran r = new Terran();
        r.name = "T13";
        Terran s = new Terran();
        s.name = "T14";
        Terran t = new Terran();
        t.name = "T15";
        Terran u = new Terran();
        u.name = "T16";
        Terran v = new Terran();
        v.name = "T17";
        Terran w = new Terran();
        w.name = "T18";
        Terran x = new Terran();
        x.name = "T19";
        Terran y = new Terran();
        y.name = "T20";
        Terran z = new Terran();
        z.name = "T21";
        Terran one = new Terran();
        one.name = "T22";
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