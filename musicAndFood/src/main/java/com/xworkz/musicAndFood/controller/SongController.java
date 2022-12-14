package com.xworkz.musicAndFood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicAndFood.dto.MusicDto;

@Component
@RequestMapping("/")
public class SongController {

	Collection<MusicDto> songDTOs = new ArrayList<MusicDto>();

	public SongController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/song.do")
	public String songAdd(MusicDto songDTO, Model model) {
		System.out.println("Calling songAdd");
		System.out.println("Fecthing the SongsDTo details" + songDTO);
		model.addAttribute("SongsDto", songDTO);
		boolean add = songDTOs.add(songDTO);
		System.out.println(add);

		return "music.jsp";

	}

	@RequestMapping("/DisplaySong.do")
	public String viewSongs(Model model) {
		System.out.println("calling viewSongs");
		model.addAttribute("list", this.songDTOs);
		return "/DisplaySong.jsp";

	}
}
