package io.prophecy.pipelines.livybenchmarkpipeline

import io.prophecy.libs._
import io.prophecy.pipelines.livybenchmarkpipeline.config._
import io.prophecy.pipelines.livybenchmarkpipeline.config.ConfigStore.interimOutput
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.UDFs._
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livybenchmarkpipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def graph(context: Context): Unit = {
    val df_annual = annual(context).interim(
      "graph",
      "TpooNtHYwc3DPulurGgX3$$AIDDAGmwtkFT3yJEdC0JF",
      "e4KI8DcSgU6d7ybamw60-$$NJ0Ga2z-zZ4yp09WVwUnn"
    )
    val df_Reformat_1_1_3_5 = Reformat_1_1_3_5(context, df_annual).interim(
      "graph",
      "GuRJjl9jAH9bHsQdC0RYT$$4HXYHoHN4H2_ba5a-u1v4",
      "WBW9jenaUM5xjpmHgOVZM$$goh18mIs7sV9kl7q75y8c"
    )
    val df_Reformat_1_1_5_5 =
      Reformat_1_1_5_5(context, df_Reformat_1_1_3_5).interim(
        "graph",
        "SxYLnY4VJxyHmgGrQm5yG$$BImFyRl_qn59kKQ6K7IZx",
        "Wu7aVJ6LHc0QectoHSN9x$$dQpyuo75pPUmOBIatmSAA"
      )
    val df_Reformat_1_1_8 = Reformat_1_1_8(context, df_annual).interim(
      "graph",
      "rMEEoq80P-0fvy238XwcQ$$p7yNU9qGHcWkerXtYynn6",
      "5gX9DUh2j2rWw2X4q6xyJ$$1ApfSyKAK6pQDJiNYO7wn"
    )
    val df_Reformat_1_1_4_5 =
      Reformat_1_1_4_5(context, df_Reformat_1_1_8).interim(
        "graph",
        "9fJpFtEwOIb2r2S1kRxi-$$1JNNWkFvtcW__vG7Ve7xh",
        "5hVoYLU6tBPM7wUTsDe4E$$_M0SmwkVaSE3kdYDvDCsU"
      )
    val df_SetOperation_1_5 = SetOperation_1_5(context,
                                               df_Reformat_1_1_4_5,
                                               df_Reformat_1_1_5_5
    ).interim("graph",
              "osjSP8MTU3Le76eOLrkD5$$1uhhHodYBQeoW862n7Abq",
              "MfRUBq9wlTIqjW5u5lZID$$1mQ1MLh_3WqbaStPDTxsF"
    )
    val df_Reformat_1_1_3_5_1 =
      Reformat_1_1_3_5_1(context, df_SetOperation_1_5).interim(
        "graph",
        "1020KfKlqoK7EqlNoikSj$$L_GtALq0emPFabXJXvbug",
        "cRsu_6wkqz1bkd8j2lrQQ$$tbAH0Bn7l08oSvc-cM3zT"
      )
    val df_Reformat_1_1_5_5_1 =
      Reformat_1_1_5_5_1(context, df_Reformat_1_1_3_5_1).interim(
        "graph",
        "bJM56O3FpJf2CYTwxijSQ$$_0vMMySowUE-oM6HtX9NX",
        "aq0pHeOvVLGMnOJ60U4CI$$OF9lVf-m5fBGYcgWgp-M2"
      )
    val df_Reformat_1_1_8_1 =
      Reformat_1_1_8_1(context, df_SetOperation_1_5).interim(
        "graph",
        "s9gFarM9Kc-XK24jPgLi-$$nkOVSG96PBOf4vi1WIrc9",
        "bg_BTNIF-Ay6Yo7C0nu8s$$wxGOfljL_hqaabhJzAmi-"
      )
    val df_Reformat_1_1_4_5_1 =
      Reformat_1_1_4_5_1(context, df_Reformat_1_1_8_1).interim(
        "graph",
        "p8h87JPFnzb1f6f_eOrqJ$$pFxugE1yuFYuaN9PeCUwu",
        "yN8toicLqI2q_Z4AAgU2m$$HA3LyprHNYGpN_enoea9b"
      )
    val df_SetOperation_1_5_1 = SetOperation_1_5_1(context,
                                                   df_Reformat_1_1_4_5_1,
                                                   df_Reformat_1_1_5_5_1
    ).interim("graph",
              "vN2z3onKykim8uMfQad-N$$t3BE2wYOtCCy4f6RhBNYX",
              "vVfpmw6CECYnM29V8PjUS$$sCPoZvqQojrVq9TGuJatp"
    )
    val df_Reformat_1_1_3_5_2 =
      Reformat_1_1_3_5_2(context, df_SetOperation_1_5_1).interim(
        "graph",
        "qK-2-a-wB5wtqX6BI_m1A$$iYwFahRi5AHMD-XmGshrC",
        "3b_b66dQzxW7LPpjkVlx5$$NbBWOx9sc_BRxVruo2Sva"
      )
    val df_Reformat_1_1_5_5_2 =
      Reformat_1_1_5_5_2(context, df_Reformat_1_1_3_5_2).interim(
        "graph",
        "T4Cl48MLJvD9KEkQ8fYir$$RtAgMj5YCzxUmAaDyaTZ8",
        "0avRanw43awu1hbEOi4Vh$$2DbQ76H4B52Do-3SWKD1S"
      )
    val df_Reformat_1_1_8_2 =
      Reformat_1_1_8_2(context, df_SetOperation_1_5_1).interim(
        "graph",
        "DCKvDLcY0Y4mU9Zh5uJq5$$NSYLT6-dPIDhK-7DQHo_p",
        "nDosWCWSKuzxUdqcqonHO$$3VS3o9vzBCKvefGtX_x1T"
      )
    val df_Reformat_1_1_4_5_2 =
      Reformat_1_1_4_5_2(context, df_Reformat_1_1_8_2).interim(
        "graph",
        "0I4rxUScYjCCspVC3TCLm$$VzbYqBrDpp1SvK_Za7lol",
        "cM3rAuQXb_PUj9HrcbJyk$$yfbQR-VR4Bokld2BpR1Jd"
      )
    val df_SetOperation_1_5_2 = SetOperation_1_5_2(context,
                                                   df_Reformat_1_1_4_5_2,
                                                   df_Reformat_1_1_5_5_2
    ).interim("graph",
              "hHA8y0TJE8z5EZmS81MVq$$ufZdP7fYzgsxF2Y5W6OoS",
              "VJZsOxk25NrOU7YrEJcww$$FtEOmneMbCB0F3oPZOYFO"
    )
    val df_Reformat_1_1_3_5_1_1 =
      Reformat_1_1_3_5_1_1(context, df_SetOperation_1_5_2).interim(
        "graph",
        "N_w5_wqAdINad_M9XMC4B$$xE8Wsa-hbJ1bkfbSM4nG4",
        "Ny9NJhvRqLjxPNhpsehVd$$dk8RHk2vtHUsvas9UcvGT"
      )
    val df_Reformat_1_1_5_5_1_1 =
      Reformat_1_1_5_5_1_1(context, df_Reformat_1_1_3_5_1_1).interim(
        "graph",
        "q9y6RGQhAEqI1vMbEt0x4$$7rVaUaJMBR4zJBb0b1734",
        "TLthY91rcinxZPVLPUq0l$$D_yrARr35PElURZFDKDuW"
      )
    val df_Reformat_1_1_8_1_1 =
      Reformat_1_1_8_1_1(context, df_SetOperation_1_5_2).interim(
        "graph",
        "XSSZdRVbMPFutJsLor1en$$pfBIY9aP0ZJerGmio2cqL",
        "GFwa24uFQuLK22dbgQwyH$$5Nxs4F0GSvWHT4Suwyi0_"
      )
    val df_Reformat_1_1_4_5_1_1 =
      Reformat_1_1_4_5_1_1(context, df_Reformat_1_1_8_1_1).interim(
        "graph",
        "lPa6GFZWHW66a-Sb0XG2D$$4OzAaP2Wg5OR5BiSH6haM",
        "4rAbTLL1npzh5EjQXQ-W1$$YeTPAvU2QS9iR69iqFuku"
      )
    val df_SetOperation_1_5_1_1 = SetOperation_1_5_1_1(context,
                                                       df_Reformat_1_1_4_5_1_1,
                                                       df_Reformat_1_1_5_5_1_1
    ).interim("graph",
              "SY-hpPX8uhibfyxWpXlWX$$VK_2PXPwPB42Qo778jWSR",
              "RarfF9oPQmY8XeVBmZ-Kq$$jclJXetCRPg6XyE2-kh4j"
    )
    val df_Reformat_1_1_3_5_3 =
      Reformat_1_1_3_5_3(context, df_SetOperation_1_5_1_1).interim(
        "graph",
        "tJMSu867CYfei0YJfZwYj$$RkImr1Au1PgybWrRLzkSd",
        "j49QkWhXFqAJVreFF6Jc5$$LA_HYzAbvld-m6pGXxvF1"
      )
    val df_Reformat_1_1_5_5_3 =
      Reformat_1_1_5_5_3(context, df_Reformat_1_1_3_5_3).interim(
        "graph",
        "5NMbVmbf-wSuI1GbBvy2j$$FU7cZyCZj1yb_6fmlCmFU",
        "XxT7UdxetNPHzeNOT_UQZ$$IPKn58WQRxsAU_mEoJ0EH"
      )
    val df_Reformat_1_1_8_3 =
      Reformat_1_1_8_3(context, df_SetOperation_1_5_1_1).interim(
        "graph",
        "jO_VrfFrbW-ViyEF74Jhx$$B_lIaPdOfZpanoHmH8PeL",
        "MUPK0uz4Rl5OaOAoyVZ1g$$Vb9ViE1yvoTOXeB3O97fU"
      )
    val df_Reformat_1_1_4_5_3 =
      Reformat_1_1_4_5_3(context, df_Reformat_1_1_8_3).interim(
        "graph",
        "zlkSovkphGai4yY8pcwcB$$Z09nvaPpfjzS_2A9TLBJb",
        "bmK_jVDD03zuFcKs5xXH7$$6pB62W0iGyJvJYUoAGhlA"
      )
    val df_SetOperation_1_5_3 = SetOperation_1_5_3(context,
                                                   df_Reformat_1_1_4_5_3,
                                                   df_Reformat_1_1_5_5_3
    ).interim("graph",
              "RZ2DRFbFmfvBzLjo-PYwz$$lIbuz-aWJVjrbDtuHSQv6",
              "J-4By8DBcV2S1UoKYoMLa$$UJ3jHVpMBXLPA3OK_oebO"
    )
    val df_Reformat_1_1_3_5_1_2 =
      Reformat_1_1_3_5_1_2(context, df_SetOperation_1_5_3).interim(
        "graph",
        "RcCbrc1HoOYP9ap6P_Ik8$$UIo8g4zGklNSE6L0M6B7S",
        "06PDpRJJvFTNbg8445AqY$$H8qwL2HgmHqAQkbm5dLjR"
      )
    val df_Reformat_1_1_5_5_1_2 =
      Reformat_1_1_5_5_1_2(context, df_Reformat_1_1_3_5_1_2).interim(
        "graph",
        "CIkVWsP8hg5yHq3mzlaTW$$Lr_KvrJFzuZ65_u72Ouqg",
        "c_l3z1C2A74v3EDHt2OXy$$gjugyGf_TCI87FXEKpjpI"
      )
    val df_Reformat_1_1_8_1_2 =
      Reformat_1_1_8_1_2(context, df_SetOperation_1_5_3).interim(
        "graph",
        "-VvTyCBGD3RkFe_J2MFW5$$GUycYVergPjbfR2h9ZApR",
        "V6rqW480n1RdnunDTlgrr$$YUN4xiZBBSmcO8Jmc69vU"
      )
    val df_Reformat_1_1_4_5_1_2 =
      Reformat_1_1_4_5_1_2(context, df_Reformat_1_1_8_1_2).interim(
        "graph",
        "n5UP81g4aFK3sAchfoxnA$$3HRzlJHsqfR3YIeBo3LR1",
        "MEo5GPlz6EWwWIbwDpW7y$$Sf2JMsywvAhgUSt-2h_CX"
      )
    val df_SetOperation_1_5_1_2 = SetOperation_1_5_1_2(context,
                                                       df_Reformat_1_1_4_5_1_2,
                                                       df_Reformat_1_1_5_5_1_2
    ).interim("graph",
              "99Hqs1HmdQ-nYwJuwrh_U$$mTwkl_K6S9XM7zEg7Wz56",
              "Jg_AOuga2912ppZ012lxc$$w1SQ6e26mQBAxZ2Rifx1T"
    )
    val df_Reformat_1_1_8_2_1 =
      Reformat_1_1_8_2_1(context, df_SetOperation_1_5_1_2).interim(
        "graph",
        "d9FDr0wDyOdHF8BLmn9Db$$Q0LcnUj5FcDPjSVjBI8x9",
        "NSfFgThnZPf94jx1lS--4$$Ey0p54PKoKwgCtUvaVA5d"
      )
    val df_Reformat_1_1_3_5_2_1 =
      Reformat_1_1_3_5_2_1(context, df_SetOperation_1_5_1_2).interim(
        "graph",
        "BlBcHvzcwDbOkcMIglxUi$$F5Jn3IkKFaMmZi_3TU7nw",
        "iGO7yiJOpvlLgg4iWsgth$$yu3dcxyj-wZ3lRi1AqQus"
      )
    val df_Reformat_1_1_5_5_2_1 =
      Reformat_1_1_5_5_2_1(context, df_Reformat_1_1_3_5_2_1).interim(
        "graph",
        "0aeLjVHzgpI1Bc4gguT_r$$owD4UE8WEDP2xK9z-TZbG",
        "PivH5sxus_sCueR1z_inL$$FiU9CdfZMJqJ7SGVKnAcz"
      )
    val df_Reformat_1_1_4_5_2_1 =
      Reformat_1_1_4_5_2_1(context, df_Reformat_1_1_8_2_1).interim(
        "graph",
        "NHjxNNTYEvShQHx1AwRBz$$3fzpEFWNe0PHZM86XcDR-",
        "7zQDdL_vo3Uo-Bd8xcSHM$$9iySK4gXTRh4ZH6AZ5fQ8"
      )
    val df_SetOperation_1_5_2_1 = SetOperation_1_5_2_1(context,
                                                       df_Reformat_1_1_4_5_2_1,
                                                       df_Reformat_1_1_5_5_2_1
    ).interim("graph",
              "vdktny_jZJkH5oeMKisiq$$EJzmUyr3MlwXLdzk0nkvE",
              "ECRPv8Bd5SKlEBCIx_XKY$$GMaNxzYPHCd1IiK3psrdk"
    )
    val df_Reformat_1_1_3_5_1_1_1 =
      Reformat_1_1_3_5_1_1_1(context, df_SetOperation_1_5_2_1).interim(
        "graph",
        "2yFaUHdVaw7znfrE0dKO2$$PxPwfasJD4b4lL0HNXi4m",
        "MrVgHGQCefsHGMIg2N63c$$XkDdbQ1Kc2slEhB9ltcHg"
      )
    val df_Reformat_1_1_5_5_1_1_1 =
      Reformat_1_1_5_5_1_1_1(context, df_Reformat_1_1_3_5_1_1_1).interim(
        "graph",
        "vc5YLTXomM1yPKDKt8grc$$qeY6A2k39KWv2E23hrLeZ",
        "20RXdmoM_ruYkFZ9YUwnx$$BETesLsRqNnx3AcUCTRK6"
      )
    val df_Reformat_1_1_8_1_1_1 =
      Reformat_1_1_8_1_1_1(context, df_SetOperation_1_5_2_1).interim(
        "graph",
        "Pmud_QCtOg9w8ruyrhuWW$$T9pl9zOrSEjNd8T-YdXOT",
        "JRR3sLNfafnpJyimhJUEs$$nT8jcsHyszwIz9O8Ywccz"
      )
    val df_Reformat_1_1_4_5_1_1_1 =
      Reformat_1_1_4_5_1_1_1(context, df_Reformat_1_1_8_1_1_1).interim(
        "graph",
        "qyK_qScECDKrKIWv9hlvr$$bmyp7NkWG4Wgpr5FQ7Q-B",
        "oGcZKeg-4DmMG7ucU89i_$$sBUjtTpSYrczxLwP425Pm"
      )
    val df_SetOperation_1_5_1_1_1 =
      SetOperation_1_5_1_1_1(context,
                             df_Reformat_1_1_4_5_1_1_1,
                             df_Reformat_1_1_5_5_1_1_1
      ).interim("graph",
                "AfQE6Um8Jwf92nvwuNmNZ$$sbRLcylfHbL0vxHKf3w9N",
                "KJU1qiuisA8WDVO3MJFxd$$SgAQtxxJMnC-q3VwGs5Wg"
      )
    val df_Reformat_1_1_3_5_2_1_1 =
      Reformat_1_1_3_5_2_1_1(context, df_SetOperation_1_5_1_1_1).interim(
        "graph",
        "veIxHkaWiJnVTK0AfGhlP$$oSof_8y8goZT-ZaY2GSvX",
        "4eLcH55fmRaxdu588AEfa$$YfMgSBc6MyvK7qUwjjKle"
      )
    val df_Reformat_1_1_5_5_2_1_1 =
      Reformat_1_1_5_5_2_1_1(context, df_Reformat_1_1_3_5_2_1_1).interim(
        "graph",
        "ziBvDXPngW3WCWRXp2TD4$$i6nfDgcvdYJDDBDrPnsB-",
        "6d6gpfRNBvfFuI2FIr9tq$$8xVXXxgmoLav-cROp2VHY"
      )
    val df_Reformat_1_1_8_2_1_1 =
      Reformat_1_1_8_2_1_1(context, df_SetOperation_1_5_1_1_1).interim(
        "graph",
        "tIZ4mNtqGyClhQV8qX63I$$tCsh5SjbnAnBygnGcU6as",
        "lOtnmQ2AHyGE6a-46_Zcq$$Oxse42MB6VSd3mBUxDrcS"
      )
    val df_Reformat_1_1_4_5_2_1_1 =
      Reformat_1_1_4_5_2_1_1(context, df_Reformat_1_1_8_2_1_1).interim(
        "graph",
        "es8LSH4jt77krh0ldN2KQ$$vxvOVH5gYhOmsOLfSE-pv",
        "hIdYjBRFAk7CXUryfstcg$$sr250AxL8E6vL4MRi8aEQ"
      )
    val df_SetOperation_1_5_2_1_1 =
      SetOperation_1_5_2_1_1(context,
                             df_Reformat_1_1_4_5_2_1_1,
                             df_Reformat_1_1_5_5_2_1_1
      ).interim("graph",
                "OSeYY44em96JouKgtaQh5$$KtkFuPnenBaV3T1-et20A",
                "waypMrda9P4ixoVzuKEZO$$EqpnIxFP4CE_b5tCbr2MQ"
      )
    val df_Reformat_1_1_3_5_1_1_1_1 =
      Reformat_1_1_3_5_1_1_1_1(context, df_SetOperation_1_5_2_1_1).interim(
        "graph",
        "vn7GAv6ODFRWMOM4-4EC7$$qvExsiUbgMkWgqj0noddC",
        "_mdHBrPAgyVYAIMSV4Fzo$$osSr7OZlZr5qfhly1o7RF"
      )
    val df_Reformat_1_1_5_5_1_1_1_1 =
      Reformat_1_1_5_5_1_1_1_1(context, df_Reformat_1_1_3_5_1_1_1_1).interim(
        "graph",
        "ikbmAj860Ls6gZAO8lq-R$$EVX3IOaSnzXXtbP0K5w9E",
        "aHKLL50pxdAw7oo-JKGVN$$ULcdiX7uT6r--w2HwkoGt"
      )
    val df_Reformat_1_1_8_1_1_1_1 =
      Reformat_1_1_8_1_1_1_1(context, df_SetOperation_1_5_2_1_1).interim(
        "graph",
        "2w58oA9nkuYvw7BbLZDH6$$Bdb0bfRz5bhOovP5ZwoJ1",
        "_HaPW7wg4CavFp4JLl3SJ$$C2rqunituvqRWJseLQQdJ"
      )
    val df_Reformat_1_1_4_5_1_1_1_1 =
      Reformat_1_1_4_5_1_1_1_1(context, df_Reformat_1_1_8_1_1_1_1).interim(
        "graph",
        "v_Sqc41R_JhTz45qyK51m$$AeWDaUCS-bDVfUm2lB101",
        "MzN4pHdXlddEyLRFobkla$$dJYJ-4EAMQ7JrrtswDjfv"
      )
    val df_SetOperation_1_5_1_1_1_1 =
      SetOperation_1_5_1_1_1_1(context,
                               df_Reformat_1_1_4_5_1_1_1_1,
                               df_Reformat_1_1_5_5_1_1_1_1
      ).interim("graph",
                "1lbhFdQJZjLlPnJd4gmjL$$iG3sA_IlzymJtJpXCUeJl",
                "yKC3MuaTVf-pHGV5F4XBm$$ax0nvYmNWSdhj9wfc4OFq"
      )
    val df_Reformat_1_1_3_5_1_2_1 =
      Reformat_1_1_3_5_1_2_1(context, df_SetOperation_1_5_1_1_1_1).interim(
        "graph",
        "ph5EF6hezyb0vk6m_8MJj$$OQ_oj6EOYg0CxZFfSPZbE",
        "otAWluKjKnPPo6F8wtdpv$$N4r0VFX-ungiPeIfeDtHF"
      )
    val df_Reformat_1_1_5_5_1_2_1 =
      Reformat_1_1_5_5_1_2_1(context, df_Reformat_1_1_3_5_1_2_1).interim(
        "graph",
        "WjsdxUGZfotrnYBSyYNdO$$-Gx8jQfdXRl55R7uhLi-m",
        "PiI1gcapw1lSQiwurDLp7$$p7VNU6p1swPeMD-aSSEJx"
      )
    val df_Reformat_1_1_8_1_2_1 =
      Reformat_1_1_8_1_2_1(context, df_SetOperation_1_5_1_1_1_1).interim(
        "graph",
        "GibEb1YPVNWlkWW2jnGaJ$$1y2WcCcshu9GlMEVev7el",
        "3eBizJoBHHlUERulf9Zhf$$le7LP-F27N0_9PQ1ADHzr"
      )
    val df_Reformat_1_1_4_5_1_2_1 =
      Reformat_1_1_4_5_1_2_1(context, df_Reformat_1_1_8_1_2_1).interim(
        "graph",
        "pQkMPJO-21jmxcWYLhONK$$nzFZGCtRdE1bfGqXXkQzt",
        "_xykQ7Zref9mGzhXfTzbP$$mWjR_76cSmLCBAh1S63Jc"
      )
    val df_SetOperation_1_5_1_2_1 =
      SetOperation_1_5_1_2_1(context,
                             df_Reformat_1_1_4_5_1_2_1,
                             df_Reformat_1_1_5_5_1_2_1
      ).interim("graph",
                "B-sRjrh_bMcgweR-twNtS$$WB1vI-luPJFjnmPMFw5eE",
                "A60sX0IrPrQHwwWY6raZp$$_RvDC-L5N3ZdUZVgOWuej"
      )
    val df_Reformat_1_1_3_5_2_1_2 =
      Reformat_1_1_3_5_2_1_2(context, df_SetOperation_1_5_1_2_1).interim(
        "graph",
        "UbN8OQYFm2S7z85BKBvYK$$UDytTbysB6cbds9Dz5cZI",
        "TU9uZAb0pI5mRFZJNaTDW$$OMRLO8FNxxo4kYnIZyjty"
      )
    val df_Reformat_1_1_5_5_2_1_2 =
      Reformat_1_1_5_5_2_1_2(context, df_Reformat_1_1_3_5_2_1_2).interim(
        "graph",
        "NKKBW0xGEpb-rl_7tB8k9$$23tn5b6R41gJ2AzjrExNW",
        "X6CguBByhS7x16ySHdWLD$$eQp7V2KghmqrraQ7utjny"
      )
    val df_Reformat_1_1_8_2_1_2 =
      Reformat_1_1_8_2_1_2(context, df_SetOperation_1_5_1_2_1).interim(
        "graph",
        "ha0yce2QQT9uR8bWJ7T4q$$c6gCuPM4nMkWSFy7JkJHh",
        "RMhrnHatldp6eGMwXOnbP$$DCccyILIOnKySHBJrZLbc"
      )
    val df_Reformat_1_1_4_5_2_1_2 =
      Reformat_1_1_4_5_2_1_2(context, df_Reformat_1_1_8_2_1_2).interim(
        "graph",
        "M4rJwNaF2jLzPv8kvOCCQ$$Hgs_pUH0sdlNjizH_qey8",
        "JHLtRz3CCUwBhqptaLhsI$$t_fS9IkiQijrDkPwhec-v"
      )
    val df_SetOperation_1_5_2_1_2 =
      SetOperation_1_5_2_1_2(context,
                             df_Reformat_1_1_4_5_2_1_2,
                             df_Reformat_1_1_5_5_2_1_2
      ).interim("graph",
                "ZtjaRCCRAb9UjIT12yk8v$$jCL2V7CfxVoAIV8G8mMOA",
                "dK07gCHPoLZOgeFeDf-ps$$s8i-OlEIP-2gRXrL6Z2B0"
      )
    val df_Reformat_1_1_3_5_1_1_1_2 =
      Reformat_1_1_3_5_1_1_1_2(context, df_SetOperation_1_5_2_1_2).interim(
        "graph",
        "i5P6gb7hc2ROjHXLaGw-t$$_C0YKaANpM8Qc9VK6ffVT",
        "E0lCVpwD6bXd2E2g06Mfi$$eaA7cAyWONRG4WnB6164h"
      )
    val df_Reformat_1_1_5_5_1_1_1_2 =
      Reformat_1_1_5_5_1_1_1_2(context, df_Reformat_1_1_3_5_1_1_1_2).interim(
        "graph",
        "tzbHY5HSjCBrL8eItkKbK$$84vALPyskOgpRGSsJqL3l",
        "ibeRGGTwqRuqs-9lYXzoD$$i-wfFbzruVhWCQXD_PF_O"
      )
    val df_Reformat_1_1_8_1_1_1_2 =
      Reformat_1_1_8_1_1_1_2(context, df_SetOperation_1_5_2_1_2).interim(
        "graph",
        "l6SMaFoZckfpQ--GmIiOQ$$C9PR7MQ_nVLeNX1oVtoOS",
        "ZKsQzZJ3rI8YLmykZv98h$$Klq-StNWCpulmbnQexi8C"
      )
    val df_Reformat_1_1_4_5_1_1_1_2 =
      Reformat_1_1_4_5_1_1_1_2(context, df_Reformat_1_1_8_1_1_1_2).interim(
        "graph",
        "_Qkxk3M65x6SNvkK66SrI$$YY0bZeWxgKT6BmB7jTGHB",
        "jkcL_CnnISLfMRw1Jxobr$$bul1GrbeM06OQOYIXMFfm"
      )
    val df_SetOperation_1_5_1_1_1_2 =
      SetOperation_1_5_1_1_1_2(context,
                               df_Reformat_1_1_4_5_1_1_1_2,
                               df_Reformat_1_1_5_5_1_1_1_2
      ).interim("graph",
                "Hxs6F_rlrEhOkp_O5Dyig$$ARgNorJng8slvBoXli7bk",
                "y3zBBXJTEFdz6K59n3PPW$$7WTF20WXvFJYPkh16kq8e"
      )
    val df_Reformat_1_1_3_5_2_1_1_1 =
      Reformat_1_1_3_5_2_1_1_1(context, df_SetOperation_1_5_1_1_1_2).interim(
        "graph",
        "fhgaaocVyNUFUysK8EUqR$$0XkeCItYpM8GpxywegmQk",
        "0kh-B1d8vVG1cKeVAxIhd$$fZOD21R32GgzklbyLK9sp"
      )
    val df_Reformat_1_1_5_5_2_1_1_1 =
      Reformat_1_1_5_5_2_1_1_1(context, df_Reformat_1_1_3_5_2_1_1_1).interim(
        "graph",
        "LbPI9WsqfUErwpQasaN3P$$2a3Y4o86fmTXsI__oe5gc",
        "rhXUbJbDNK4RTtpN_LQIt$$u5u-jgdDtL5fM6XUgWku1"
      )
    val df_Reformat_1_1_8_2_1_1_1 =
      Reformat_1_1_8_2_1_1_1(context, df_SetOperation_1_5_1_1_1_2).interim(
        "graph",
        "fqB-XKJYRb-l_hZok7NjA$$DZi9gW2o6kvIap6gXXZfc",
        "fovtzw9KVYX1ATpd3ONLB$$N8FzvzKJT13iW34_AwpFF"
      )
    val df_Reformat_1_1_4_5_2_1_1_1 =
      Reformat_1_1_4_5_2_1_1_1(context, df_Reformat_1_1_8_2_1_1_1).interim(
        "graph",
        "uSORXPnRtAT4BjG5x16bJ$$S9xrn-fS-gi8nvCasZSKy",
        "eqBl3KlB2pvtNq5Y8NVCn$$rLn5-wMEDsPVQnDYoruTs"
      )
    val df_SetOperation_1_5_2_1_1_1 =
      SetOperation_1_5_2_1_1_1(context,
                               df_Reformat_1_1_4_5_2_1_1_1,
                               df_Reformat_1_1_5_5_2_1_1_1
      ).interim("graph",
                "aa22EV8lmcAClKLvyiqJ1$$GaAtBUFSZngMZ0-9I2Ukt",
                "fGICr_skcnS1F0Q15Mohz$$yf5H4HIDSkMKfh9aQ_6LZ"
      )
    val df_Reformat_1_1_3_5_1_1_1_1_1 =
      Reformat_1_1_3_5_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1).interim(
        "graph",
        "_EQPvLsvV0VG81T4Yn2B3$$Su9EiD4dchLgBfWh5Aemv",
        "dPnwUF81lUHmhaVJ5Vs2O$$qknCg9FN_i-4BjLYNQA8R"
      )
    val df_Reformat_1_1_5_5_1_1_1_1_1 = Reformat_1_1_5_5_1_1_1_1_1(
      context,
      df_Reformat_1_1_3_5_1_1_1_1_1
    ).interim("graph",
              "IWPjdb5VeWdYQBp1D85VQ$$CAW2wSsuWMt9aL7yiQhaP",
              "IS8I9QOESvV7ApyKvNwLl$$7zNJ4RKSeLXhacr0r7yWm"
    )
    val df_Reformat_1_1_8_1_1_1_1_1 =
      Reformat_1_1_8_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1).interim(
        "graph",
        "JTHxXmcntoqcWPxRyY5uy$$re3sr-Aa4H25n5q4hECyM",
        "cpDygALI9zMk6nMN-XDoR$$cEVxbaEUMZksVg8xjjNzs"
      )
    val df_Reformat_1_1_4_5_1_1_1_1_1 =
      Reformat_1_1_4_5_1_1_1_1_1(context, df_Reformat_1_1_8_1_1_1_1_1).interim(
        "graph",
        "Fb-c2ybY1Wp4cGS6hf2Ek$$nRTpuPKVTtISJdUU6YJa7",
        "V5H78cbUT60Dg52_mxT8l$$fdgRGY74I2EdlnBlH8lew"
      )
    val df_SetOperation_1_5_1_1_1_1_1 =
      SetOperation_1_5_1_1_1_1_1(context,
                                 df_Reformat_1_1_4_5_1_1_1_1_1,
                                 df_Reformat_1_1_5_5_1_1_1_1_1
      ).interim("graph",
                "jjdAWmj7syMFYMOAQAVrB$$iDNMCg2lrfkjyx_2NOX_6",
                "iDqgCG85Mj2e6foWpSkav$$rdpv6IPwMb0NPS-BcpJfX"
      )
    val df_Reformat_1_1_3_5_1_2_1_1 =
      Reformat_1_1_3_5_1_2_1_1(context, df_SetOperation_1_5_1_1_1_1_1).interim(
        "graph",
        "G1IB1xfauu5rly5cp2yDi$$x3zPrRr4yvPGYxNVEoMul",
        "hFDtRbc1sOnZq92EJn7IP$$STw6PyMWrvH0J_A3KPcq9"
      )
    val df_Reformat_1_1_5_5_1_2_1_1 =
      Reformat_1_1_5_5_1_2_1_1(context, df_Reformat_1_1_3_5_1_2_1_1).interim(
        "graph",
        "f0mbQ8HtW50wBNou7aqao$$dFsDychnghKF13WD8-ZCP",
        "HIKHZfZp9-4oU3waiCauS$$iueEoVnj0Wm02y050hFwc"
      )
    val df_Reformat_1_1_8_1_2_1_1 =
      Reformat_1_1_8_1_2_1_1(context, df_SetOperation_1_5_1_1_1_1_1).interim(
        "graph",
        "Xz8bztLI0ydblkWYWaPVX$$ZTIpfF56O6fLQFOI9f0Vu",
        "KsZCzEky9yOeXgpHGpxQc$$sDygjwH0KHHqBVsQ7n7qf"
      )
    val df_Reformat_1_1_4_5_1_2_1_1 =
      Reformat_1_1_4_5_1_2_1_1(context, df_Reformat_1_1_8_1_2_1_1).interim(
        "graph",
        "9-2KgfnmwTSXiGobvKEpy$$RSKkXNRd-NPAfXqJrW-tt",
        "vHR3miH_TCYpazdTJ7qYc$$oIAnLg1W0PeANlHYN61ab"
      )
    val df_SetOperation_1_5_1_2_1_1 =
      SetOperation_1_5_1_2_1_1(context,
                               df_Reformat_1_1_4_5_1_2_1_1,
                               df_Reformat_1_1_5_5_1_2_1_1
      ).interim("graph",
                "vMhjtvaOWE9h3Be_QDZrX$$ZWa7ZkhG3YNJ9ntRRp0Z_",
                "PsU_LO8XDpAsHtXs0RYoc$$-gLPRi5gwhmm-8ZINpZNB"
      )
    val df_Reformat_1_1_3_5_2_1_2_1 =
      Reformat_1_1_3_5_2_1_2_1(context, df_SetOperation_1_5_1_2_1_1).interim(
        "graph",
        "kHYbhVf-bqBeSfE4v4ffX$$90JpOT4MrbeDgtAQ7EVT3",
        "t-Oin2Aunnfm7m2GxQAUT$$c-K4u3JvPKwmt-F55FNN2"
      )
    val df_Reformat_1_1_5_5_2_1_2_1 =
      Reformat_1_1_5_5_2_1_2_1(context, df_Reformat_1_1_3_5_2_1_2_1).interim(
        "graph",
        "8oVNQ6PRDiOvZu9juX7jE$$uSYgFsonrac1LOz2zXiAR",
        "cPlaTg463NtACzFAX9L4l$$vvYsLK4F3wE_Xg7tJDTnJ"
      )
    val df_Reformat_1_1_8_2_1_2_1 =
      Reformat_1_1_8_2_1_2_1(context, df_SetOperation_1_5_1_2_1_1).interim(
        "graph",
        "G2IO17KHQNzx4l6hD9-ey$$xZHgP3VxvZElZs5AVOo6H",
        "8ZdPpDvijpjnf2LsGBioK$$kc8lLfpU50M4KSJxVKRYA"
      )
    val df_Reformat_1_1_4_5_2_1_2_1 =
      Reformat_1_1_4_5_2_1_2_1(context, df_Reformat_1_1_8_2_1_2_1).interim(
        "graph",
        "TvqL9igtdUeUs-q9o3t_m$$VkXqHYMCbryq84_S94LQy",
        "hwZz9R7LITlxM1h5Uy3sM$$wJpdydJh4z2eYQnTI1Si7"
      )
    val df_SetOperation_1_5_2_1_2_1 =
      SetOperation_1_5_2_1_2_1(context,
                               df_Reformat_1_1_4_5_2_1_2_1,
                               df_Reformat_1_1_5_5_2_1_2_1
      ).interim("graph",
                "hGtH36Ux96Xj5lu5mZqth$$5nAjETa2S_8kRwslRc7lo",
                "DdwUeHP-Dopv0-kGd-fvO$$khJcDUTU1jYh76R_3e0bX"
      )
    val df_Reformat_1_1_3_5_1_1_1_2_1 =
      Reformat_1_1_3_5_1_1_1_2_1(context, df_SetOperation_1_5_2_1_2_1).interim(
        "graph",
        "jXaeH8_pvSNLQI46Ifgzl$$FpW4onM0TXT-__vGQH08L",
        "wLLi2pQS-i3yaVnU0GGg1$$2iVRJwPkDyky-ft0qIESL"
      )
    val df_Reformat_1_1_5_5_1_1_1_2_1 = Reformat_1_1_5_5_1_1_1_2_1(
      context,
      df_Reformat_1_1_3_5_1_1_1_2_1
    ).interim("graph",
              "UkRQB2pOBMlleYA8TYOJ_$$OoME4xvdy-v-7n-4l8YHT",
              "hwbCzRILszG9PP3g2KxD0$$XDw126Ac08XDE5_V3_is0"
    )
    val df_Reformat_1_1_8_1_1_1_2_1 =
      Reformat_1_1_8_1_1_1_2_1(context, df_SetOperation_1_5_2_1_2_1).interim(
        "graph",
        "vLG508FNLkTjm3JQ6ITES$$Wtt0c30EWTcdJBZ1p_MMv",
        "16Wx-bm0JsNVjVL60yioX$$GhBUeHsr5uMHGit7Tlvnw"
      )
    val df_Reformat_1_1_4_5_1_1_1_2_1 =
      Reformat_1_1_4_5_1_1_1_2_1(context, df_Reformat_1_1_8_1_1_1_2_1).interim(
        "graph",
        "DUxiXHG0nu5zr9YaeKnsX$$nuJLhHPQ-tUKQa4lru-bJ",
        "cCufdnM3iyPMDWIlxb7Dm$$ijKq91WCWDWIPSYsOUIEz"
      )
    val df_SetOperation_1_5_1_1_1_2_1 =
      SetOperation_1_5_1_1_1_2_1(context,
                                 df_Reformat_1_1_4_5_1_1_1_2_1,
                                 df_Reformat_1_1_5_5_1_1_1_2_1
      ).interim("graph",
                "ayuW7x6wR4W9BnRaUZ5vA$$lRXqqIE-s-b7iMvT4WL7V",
                "ssAjO81PudqzkSQc3iJKo$$CCSM0sEmFafIXgf7wKmi1"
      )
    val df_Reformat_1_1_8_2_1_1_1_1 =
      Reformat_1_1_8_2_1_1_1_1(context, df_SetOperation_1_5_1_1_1_2_1).interim(
        "graph",
        "DaMsvX1q1X5cxtn47qy_q$$4ZG7DX463NGz76CFtL0f0",
        "yZMhGsEGlTctMgBxzI1vV$$7TqOg3U0zyFwk42jW2uga"
      )
    val df_Reformat_1_1_3_5_2_1_1_1_1 = Reformat_1_1_3_5_2_1_1_1_1(
      context,
      df_SetOperation_1_5_1_1_1_2_1
    ).interim("graph",
              "wlGKlJi9IKFoKLtP6RD8F$$eG-D1Y20zoSDQ_5KoYjMD",
              "_EWrLPQABTCZYYUN8LBln$$kZN8GNoQf5zXhJQ5wd6Zb"
    )
    val df_Reformat_1_1_5_5_2_1_1_1_1 = Reformat_1_1_5_5_2_1_1_1_1(
      context,
      df_Reformat_1_1_3_5_2_1_1_1_1
    ).interim("graph",
              "l5_063YsTDnjT_LXWGZDR$$P26t7P6-o5Ac2l8zOL7pH",
              "7U8Fq3eFXFzKgwnfLh5Ze$$01x2YAt_1I_GKnO7xSFVW"
    )
    val df_Reformat_1_1_4_5_2_1_1_1_1 =
      Reformat_1_1_4_5_2_1_1_1_1(context, df_Reformat_1_1_8_2_1_1_1_1).interim(
        "graph",
        "8kO9fNAV152LuUDPvyZu0$$5m9PANvkV5GoMhZqaRhVs",
        "4Tfz8BWcPw0qR7xnXuA8X$$wrkyScosgl-WgQ0rCZxRt"
      )
    val df_SetOperation_1_5_2_1_1_1_1 =
      SetOperation_1_5_2_1_1_1_1(context,
                                 df_Reformat_1_1_4_5_2_1_1_1_1,
                                 df_Reformat_1_1_5_5_2_1_1_1_1
      ).interim("graph",
                "yW1rUMOuydyG2DRx99M8F$$ml7bha8t7cfpinIIvDs-J",
                "7vQpoaQnRroTViho-Jmkp$$WPKWhTzaowM_a5JWsnFHa"
      )
    val df_Reformat_1_1_3_5_1_1_1_1_1_1 = Reformat_1_1_3_5_1_1_1_1_1_1(
      context,
      df_SetOperation_1_5_2_1_1_1_1
    ).interim("graph",
              "U-Csb5oOkOCTKotbC4Mht$$xz1PKOSoNJDSE9wDub_cm",
              "U6wy0fLwGhBJEP3BWogjv$$UkG5NYVKQosHMJBTxdD6w"
    )
    val df_Reformat_1_1_5_5_1_1_1_1_1_1 = Reformat_1_1_5_5_1_1_1_1_1_1(
      context,
      df_Reformat_1_1_3_5_1_1_1_1_1_1
    ).interim("graph",
              "UQZGDwzkBiynyHmlnRYpU$$gWfNNSbXngTQdnkEpve-I",
              "717ZRaxaGbLy53lNLDcEU$$4jL4lzTf-aUlEeZbFA6Bu"
    )
    val df_Reformat_1_1_8_1_1_1_1_1_1 = Reformat_1_1_8_1_1_1_1_1_1(
      context,
      df_SetOperation_1_5_2_1_1_1_1
    ).interim("graph",
              "QbjKS4cJswq2Jl_NKMvFm$$1X-J8XFdguc1Pd33bTV5Y",
              "JUVvS6s1_UHSecs6OyrWc$$Dtaq80BIpL1I5re7MbHxy"
    )
    val df_Reformat_1_1_4_5_1_1_1_1_1_1 = Reformat_1_1_4_5_1_1_1_1_1_1(
      context,
      df_Reformat_1_1_8_1_1_1_1_1_1
    ).interim("graph",
              "YN9D6ChDhIg3tGbAZ1NEf$$8-l2Pl3eQuYC9Om1YcJI0",
              "Xnjrf6lxdLWYnKljNPCor$$ZdhbGayWKpigRD81IWsgA"
    )
    val df_SetOperation_1_5_1_1_1_1_1_1 =
      SetOperation_1_5_1_1_1_1_1_1(context,
                                   df_Reformat_1_1_4_5_1_1_1_1_1_1,
                                   df_Reformat_1_1_5_5_1_1_1_1_1_1
      ).interim("graph",
                "3jxY2f-ttuoa0CSya-A_J$$aAMsUbw3QdM8rVsDAVB6M",
                "hjEtbjxiDtRCcqPtOnMWz$$2Jrf2kjz_eQ7LdnzuNNLE"
      )
    df_SetOperation_1_5_1_1_1_1_1_1.cache().count()
    df_SetOperation_1_5_1_1_1_1_1_1.unpersist()
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Livy-Benchmark-Pipeline")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    MetricsCollector.initializeMetrics(spark)
    implicit val interimOutputConsole: InterimOutput = InterimOutputHive2("")
    spark.conf.set("prophecy.collect.basic.stats",          "true")
    spark.conf.set("spark.sql.legacy.allowUntypedScalaUDF", "true")
    spark.conf.set("prophecy.metadata.pipeline.uri",
                   "pipelines/Livy-Benchmark-Pipeline"
    )
    MetricsCollector.instrument(spark, "pipelines/Livy-Benchmark-Pipeline") {
      spark.withSparkOptimisationsDisabled(graph(context))
    }
  }

}
